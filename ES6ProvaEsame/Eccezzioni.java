package ES6ProvaEsame;

public class Eccezzioni extends Exception {
    public class MotoreGiaAccesoException extends Exception {
        public MotoreGiaAccesoException() {
            super("il motore è gia acceso");
        }
    }
    public class MotoreGiaSpentoException extends Exception{
        public MotoreGiaSpentoException(){
            super("il motore è gia spento");
        }
    }
}
