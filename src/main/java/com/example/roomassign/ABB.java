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

        if (key < root.key) {
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





    public void removeAula(Aula aulaAsignada, int capacity) {
        root = removeAulaRec(root, capacity, aulaAsignada);
        System.out.println("El aula " + aulaAsignada.getEdificio() + " ha sido removida");
    }


    private NodoABB removeAulaRec(NodoABB root, int capacity, Aula aulaAsignada) {
        if (root == null) {
            return null;
        }

        if (capacity < root.key) {
            root.left = removeAulaRec(root.left, capacity, aulaAsignada);
        } else if (capacity > root.key) {
            root.right = removeAulaRec(root.right, capacity, aulaAsignada);
        } else {
            // Este nodo es el que se debe eliminar

            // Si el nodo coincide con el aula asignada, se elimina
            if (root.value == aulaAsignada) {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // Si el nodo tiene dos hijos, obtener el sucesor in-order (el nodo más pequeño en el subárbol derecho)
                root.key = minValue(root.right);
                root.right = removeAulaRec(root.right, root.key, aulaAsignada);
            } else {
                root.left = removeAulaRec(root.left, capacity, aulaAsignada);
                root.right = removeAulaRec(root.right, capacity, aulaAsignada);
            }
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