public class Isp {

    interface Aves {
        void setLocalizacao(double longitude, double latitude);
        void setAltitude(double altitude);
        void renderizar();
    }
    class Papagaio implements Aves {
        @Override
        public void setLocalizacao(double longitude, double latitude) {
            // Implementação específica para papagaio
        }

        @Override
        public void setAltitude(double altitude) {
            // Implementação específica para papagaio
        }

        @Override
        public void renderizar() {
            // Implementação específica para papagaio
        }
    }
    class Pinguim implements Aves {
        @Override
        public void setLocalizacao(double longitude, double latitude) {
            // Implementação específica para pinguim
        }

        @Override
        public void setAltitude(double altitude) {
            // Não faz nada, pois pinguins não voam
        }

        @Override
        public void renderizar() {
            // Implementação específica para pinguim
        }
    }
}
/*------------APLICANDO O I DO SOLID-------*/

interface Aves {
    void setLocalizacao(double longitude, double latitude);
    void renderizar();
}
interface AvesQueVoam extends Aves {
    void setAltitude(double altitude);
}
class Papagaio implements AvesQueVoam {
    @Override
    public void setLocalizacao(double longitude, double latitude) {
        // Lógica para definir a localização do papagaio
    }

    @Override
    public void setAltitude(double altitude) {
        // Lógica para definir a altitude de voo do papagaio
    }

    @Override
    public void renderizar() {
        // Lógica para renderizar a representação do papagaio
    }
}
class Pinguim implements Aves {
    @Override
    public void setLocalizacao(double longitude, double latitude) {
        // Lógica para definir a localização do pinguim
    }

    @Override
    public void renderizar() {
        // Lógica para renderizar a representação do pinguim
    }
}

