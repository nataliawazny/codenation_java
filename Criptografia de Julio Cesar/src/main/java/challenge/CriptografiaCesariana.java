package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        String Criptografar;
        if (texto=="") {
            throw new IllegalArgumentException("Insira uma frase");
        } else if (texto==null) {
            throw new NullPointerException("Insira uma frase");
        } else {
            StringBuilder arrayFrase = new StringBuilder();
            texto = texto.toLowerCase();
            for (int i = 0; i<texto.length(); i++) {
                int codePoint = texto.codePointAt(i);
                int codePointCriptografado = codePoint + 3;
                if (codePointCriptografado>=97 && codePointCriptografado<=122) {
                    arrayFrase.append((char) codePointCriptografado);
                } else if (codePointCriptografado>122){
                    arrayFrase.append((char) (codePointCriptografado - (26 - 3)));
                } else {
                    arrayFrase.append((char) codePoint);
                }
            }
            Criptografar = arrayFrase.toString();
            return Criptografar;
        }
    }

    @Override
    public String descriptografar(String texto) {
        String Descriptografar;
        if (texto=="") {
            throw new IllegalArgumentException("Insira uma frase");
        } else if (texto==null) {
            throw new NullPointerException("Insira uma frase");
        } else {
            StringBuilder arrayFrase = new StringBuilder();
            texto = texto.toLowerCase();
            for (int i = 0; i<texto.length(); i++) {
                int codePoint = texto.codePointAt(i);
                int codePointDescriptografado = codePoint - 3;
                if (codePointDescriptografado>=97 && codePointDescriptografado<=122) {
                    arrayFrase.append((char) codePointDescriptografado);
                } else if (codePointDescriptografado>=97){
                    arrayFrase.append((char) (codePointDescriptografado + (26 - 3)));
                } else {
                    arrayFrase.append((char) codePoint);
                }
            }
            Descriptografar = arrayFrase.toString();
            return Descriptografar;
        }

    }



}



