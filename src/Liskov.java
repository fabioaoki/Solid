public class Liskov {
    class A {
        public void getNome() {
            System.out.println("Meu nome é A");
        }
    }
    class B extends A {
        @Override
        public void getNome() {
            System.out.println("Meu nome é B");
        }
    }
    class TesteHeranca {
        public static void imprimeNome(A objeto) {
            objeto.getNome();
        }

        public void main(String[] args) {
            A objeto1 = new A();
            A objeto2 = new B();
            imprimeNome(objeto1); // Imprime: Meu nome é A
            imprimeNome(objeto2); // Imprime: Meu nome é B
        }
    }
}
