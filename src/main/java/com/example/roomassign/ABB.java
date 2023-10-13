package com.example.roomassign;



class ABB {

    NodoABB root;

    public void insert(int key, Aula value) {
        root = insertRec(root, key, value);
    }


    public void printTree(NodoABB root) {
        if (root != null) {
            printTree(root.left);
            System.out.println("Key: " + root.key + ", Aula: " + root.value.getEdificio());
            printTree(root.right);
        }
    }

    // Resto de tu clase ABB y lógica...


    private NodoABB insertRec(NodoABB root, int key, Aula value) {
        if (root == null) {
            return new NodoABB(key, value);
        }

        if (key <= root.key) {
            root.left = insertRec(root.left, key, value);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, value);
        }

        return root;
    }

    public Aula findClosestAula(int capacity, boolean proyector, String edificio) {
        return findClosestAulaRec(root, capacity, proyector, edificio, null);
    }

    private Aula findClosestAulaRec(NodoABB root, int capacity, boolean proyector, String edificio, String edificioPrefix) {
        if (root == null) {
            return null;
        }

        if ((proyector || !proyector && !root.value.tieneProyector()) &&
                (edificio == null || root.value.getEdificio().startsWith(edificio.substring(0, 2))) &&
                Math.abs(root.value.getCapacidad() - capacity) <= 5) {
            return root.value;
        }

        Aula leftClosest = findClosestAulaRec(root.left, capacity, proyector, edificio, edificioPrefix);
        Aula rightClosest = findClosestAulaRec(root.right, capacity, proyector, edificio, edificioPrefix);

        if (edificio != null && leftClosest == null && rightClosest == null) {
            return null;
        }

        if (leftClosest == null) {
            return rightClosest;
        } else if (rightClosest == null) {
            return leftClosest;
        } else {
            int leftCapacityDiff = Math.abs(capacity - leftClosest.getCapacidad());
            int rightCapacityDiff = Math.abs(rightClosest.getCapacidad() - capacity);

            if (leftCapacityDiff <= 5 && rightCapacityDiff > 5 &&
                    (edificio == null || leftClosest.getEdificio().startsWith(edificio.substring(0, 2)))) {
                return leftClosest;
            } else if (leftCapacityDiff > 5 && rightCapacityDiff <= 5 &&
                    (edificio == null || rightClosest.getEdificio().startsWith(edificio.substring(0, 2)))) {
                return rightClosest;
            } else {
                return leftCapacityDiff < rightCapacityDiff ? leftClosest : rightClosest;
            }
        }

    }





    private NodoABB removeAulaRec(NodoABB root, Aula aulaAsignada) {
        if (root == null) {
            return null;
        }

        if (root.value == aulaAsignada) {
            // caso para eliminar el nodo con el valor dado
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Si el nodo tiene dos hijos, obtener el sucesor in-order (el nodo más pequeño en el subárbol derecho)
            NodoABB minNode = findMinNode(root.right);
            root.key = minNode.key;
            root.value = minNode.value;
            root.right = removeAulaRec(root.right, minNode.value);
        } else {
            // Continuar la búsqueda en el subárbol izquierdo y derecho
            root.left = removeAulaRec(root.left, aulaAsignada);
            root.right = removeAulaRec(root.right, aulaAsignada);
        }
        return root;
    }


    private NodoABB findMinNode(NodoABB node) {
        NodoABB current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void removeAula(Aula aulaAsignada) {
        int rkey=aulaAsignada.getCapacidad();
        root = removeAulaRec(root, aulaAsignada);
        System.out.println("El aula con la capacidad " + aulaAsignada + " ha sido removida");
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