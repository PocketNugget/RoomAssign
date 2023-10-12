package com.example.roomassign;



class ABB {

    private NodoABB root;

    public void insert(int key, Aula value) {
        root = insertRec(root, key, value);
    }

    private NodoABB insertRec(NodoABB root, int key, Aula value) {
        if (root == null) {
            return new NodoABB(key, value);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key, value);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, value);
        }

        return root;
    }

    public Aula findClosestAula(int capacity) {
        return findClosestAulaRec(root, capacity);
    }

    private Aula findClosestAulaRec(NodoABB root, int capacity) {
        if (root == null) {
            return null;
        }

        if (root.value.getCapacidad() >= capacity) {
            return root.value;
        }

        Aula leftClosest = findClosestAulaRec(root.left, capacity);
        Aula rightClosest = findClosestAulaRec(root.right, capacity);

        if (leftClosest == null) {
            return rightClosest;
        } else if (rightClosest == null) {
            return leftClosest;
        } else {
            return Math.abs(capacity - leftClosest.getCapacidad()) < Math.abs(rightClosest.getCapacidad() - capacity) ? leftClosest : rightClosest;
        }
    }

    public void removeAula(Aula aulaAsignada, int capacity) {
        root = removeAulaRec(root, capacity);
        System.out.println("El aula " + aulaAsignada.getEdificio() + " ha sido removida");
    }

    private NodoABB removeAulaRec(NodoABB root, int capacity) {
        if (root == null) {
            return root;
        }

        if (capacity < root.key) {
            root.left = removeAulaRec(root.left, capacity);
        } else if (capacity > root.key) {
            root.right = removeAulaRec(root.right, capacity);
        } else {
            // Este nodo es el que se debe eliminar

            // Si el nodo tiene un solo hijo o ninguno
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Si el nodo tiene dos hijos, obtener el sucesor in-order (el nodo más pequeño en el subárbol derecho)
            root.key = minValue(root.right);
            root.right = removeAulaRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(NodoABB root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }
}