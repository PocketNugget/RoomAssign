package com.example.roomassign;



class ABB {


    NodoABB root;
public ABB(){


    // Insertar algunas aulas con diferentes capacidades y detalles
    insert(24, new Aula(24, "CN - 201", true, true));
    insert(28, new Aula(28, "HU - 206", false, false));
    insert(24, new Aula(24, "CN - 202", true, true));
    insert(35, new Aula(35, "IA - 122", true, false));
    insert(60, new Aula(60, "CS - 102", false, false));
    insert(60, new Aula(60, "IA - 105", true, true));
    insert(15, new Aula(15, "AG - 101", false, false));
    insert(20, new Aula(20, "BI - 307", true, true));

    insert(28, new Aula(28, "CE - 202", true, false));
    insert(35, new Aula(35, "CI - 120", false, false));
    insert(60, new Aula(60, "SL - 106", true, false));
    insert(28, new Aula(28, "PU - 104", true, false));
    insert(20, new Aula(20, "IOS - 101", false, false));
    insert(35, new Aula(35, "LB - 106", true, false));
    insert(30, new Aula(30, "LA - 120", true, false));
    insert(24, new Aula(24, "NE - 103", false, false));
    insert(24, new Aula(24, "CN - 101", true, true));
    insert(24, new Aula(24, "CN - 111", true, true));
    insert(24, new Aula(24, "CN - 121", true, true));
    insert(24, new Aula(24, "CN - 131", true, true));
    insert(24, new Aula(24, "CN - 141", true, true));
    insert(24, new Aula(24, "CN - 151", true, true));
    insert(24, new Aula(24, "CN - 161", true, true));
    insert(24, new Aula(24, "CN - 171", true, true));
    insert(24, new Aula(24, "CN - 181", true, true));

    insert(24, new Aula(24, "HU - 101", true, true));
    insert(30, new Aula(30, "HU - 102", true, false));
    insert(24, new Aula(24, "HU - 103", false, true));
    insert(40, new Aula(40, "HU - 104", true, false));
    insert(24, new Aula(24, "HU - 105", true, true));
    insert(50, new Aula(50, "HU - 106", true, false));
    insert(24, new Aula(24, "HU - 107", false, true));
    insert(60, new Aula(60, "HU - 108", true, false));
    insert(24, new Aula(24, "HU - 109", true, true));

    insert(24, new Aula(24, "HU - 110", false, true));
    insert(30, new Aula(30, "HU - 111", true, false));
    insert(24, new Aula(24, "HU - 112", false, true));
    insert(40, new Aula(40, "HU - 113", true, false));
    insert(24, new Aula(24, "HU - 114", true, true));
    insert(50, new Aula(50, "HU - 115", true, false));
    insert(24, new Aula(24, "HU - 116", false, true));
    insert(60, new Aula(60, "HU - 117", true, false));
    insert(24, new Aula(24, "HU - 118", true, true));
    insert(24, new Aula(24, "HU - 119", true, false));
    insert(24, new Aula(24, "NE - 101", true, true));
    insert(30, new Aula(30, "NE - 102", true, false));
    insert(24, new Aula(24, "NE - 103", false, true));
    insert(40, new Aula(40, "NE - 104", true, false));
    insert(24, new Aula(24, "NE - 105", true, true));
    insert(45, new Aula(45, "NE - 106", true, false));
    insert(24, new Aula(24, "NE - 107", false, true));
    insert(50, new Aula(50, "NE - 108", true, false));
    insert(24, new Aula(24, "NE - 109", true, true));

    insert(24, new Aula(24, "NE - 110", false, true));
    insert(30, new Aula(30, "NE - 111", true, false));
    insert(24, new Aula(24, "NE - 112", false, true));
    insert(40, new Aula(40, "NE - 113", true, false));
    insert(24, new Aula(24, "NE - 114", true, true));
    insert(45, new Aula(45, "NE - 115", true, false));
    insert(24, new Aula(24, "NE - 116", false, true));
    insert(50, new Aula(50, "NE - 117", true, false));
    insert(24, new Aula(24, "NE - 118", true, true));
    insert(24, new Aula(24, "NE - 119", true, false));
    insert(24, new Aula(24, "CS - 101", true, true));
    insert(30, new Aula(30, "CS - 102", true, false));
    insert(24, new Aula(24, "CS - 103", false, true));
    insert(40, new Aula(40, "CS - 104", true, false));
    insert(24, new Aula(24, "CS - 105", true, true));
    insert(45, new Aula(45, "CS - 106", true, false));
    insert(24, new Aula(24, "CS - 107", false, true));
    insert(50, new Aula(50, "CS - 108", true, false));
    insert(24, new Aula(24, "CS - 109", true, true));

    insert(24, new Aula(24, "CS - 110", false, true));
    insert(30, new Aula(30, "CS - 111", true, false));
    insert(24, new Aula(24, "CS - 112", false, true));
    insert(40, new Aula(40, "CS - 113", true, false));
    insert(24, new Aula(24, "CS - 114", true, true));
    insert(45, new Aula(45, "CS - 115", true, false));
    insert(24, new Aula(24, "CS - 116", false, true));
    insert(50, new Aula(50, "CS - 117", true, false));
    insert(24, new Aula(24, "CS - 118", true, true));
    insert(24, new Aula(24, "CS - 119", true, false));
    insert(24, new Aula(24, "CN - 101", true, true));
    insert(30, new Aula(30, "CN - 102", true, false));
    insert(24, new Aula(24, "CN - 103", false, true));
    insert(40, new Aula(40, "CN - 104", true, false));
    insert(24, new Aula(24, "CN - 105", true, true));
    insert(45, new Aula(45, "CN - 106", true, false));
    insert(24, new Aula(24, "CN - 107", false, true));
    insert(50, new Aula(50, "CN - 108", true, false));
    insert(24, new Aula(24, "CN - 109", true, true));

    insert(24, new Aula(24, "CN - 110", false, true));
    insert(30, new Aula(30, "CN - 111", true, false));
    insert(24, new Aula(24, "CN - 112", false, true));
    insert(40, new Aula(40, "CN - 113", true, false));
    insert(24, new Aula(24, "CN - 114", true, true));
    insert(45, new Aula(45, "CN - 115", true, false));
    insert(24, new Aula(24, "CN - 116", false, true));
    insert(50, new Aula(50, "CN - 117", true, false));
    insert(24, new Aula(24, "CN - 118", true, true));
    insert(24, new Aula(24, "CN - 119", true, false));
}
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

    public Aula findClosestAula(int capacity, boolean proyector, boolean computadoras, String edificio) {
        return findClosestAulaRec(root, capacity, proyector, computadoras, edificio);
    }
    private Aula findClosestAulaRec(NodoABB root, int capacity, boolean proyector, boolean computadoras, String edificio) {
        if (root == null) {
            return null;
        }

        // Verificar si los dos primeros caracteres de edificio coinciden
        if (root.value.getEdificio().startsWith(edificio.substring(0, 2))
                && root.value.tieneProyector() == proyector
                && root.value.tieneComputadoras() == computadoras
                && root.key >= capacity && root.key - capacity <= 5) {
            return root.value;
        }

        // Recursivamente buscar en los subárboles izquierdo y derecho
        Aula leftClosest = findClosestAulaRec(root.left, capacity, proyector, computadoras, edificio);
        Aula rightClosest = findClosestAulaRec(root.right, capacity, proyector, computadoras, edificio);

        // Comparar los resultados de los subárboles izquierdo y derecho
        if (leftClosest == null) {
            return rightClosest;
        } else if (rightClosest == null) {
            return leftClosest;
        } else {
            // Comparar las capacidades de los nodos izquierdo y derecho
            int leftCapacityDiff = Math.abs(leftClosest.getCapacidad() - capacity);
            int rightCapacityDiff = Math.abs(rightClosest.getCapacidad() - capacity);

            // Retornar el nodo con la capacidad más cercana al valor deseado
            return leftCapacityDiff <= rightCapacityDiff ? leftClosest : rightClosest;
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
        System.out.println("El aula con la capacidad " + rkey + " ha sido removida");
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