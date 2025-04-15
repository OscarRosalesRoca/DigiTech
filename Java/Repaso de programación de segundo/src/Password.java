public class Password {

    private String password;

    public Password (String password){
        this.password=password;
    }

    public boolean cambiarPassword(String nuevoPassword) {
        if (esPasswordValido(nuevoPassword)) {
            this.password = nuevoPassword;
            System.out.println("Contraseña actualizada exitosamente.");
            return true;
        } else {
            System.out.println("La nueva contraseña no cumple con los criterios mínimos.");
            System.out.println("Debe tener una longitud mínima de 8 y al menos tener un número.");
            return false;
        }
    }

    public boolean esPasswordValido(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean tieneNumero = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
                break;
            }
        }

        return tieneNumero;
    }

    public boolean esPasswordFuerte(String password) {
        boolean esPasswordFuerte = false;
        
        boolean tiene2dígitos = false;
        int contador = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                contador++;
                if (contador==2) {
                    tiene2dígitos = true;
                    break;
                }
            }
        }   

        boolean contieneCaracterEspecial = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                contieneCaracterEspecial = true;
            }
        }

        if (tiene2dígitos && contieneCaracterEspecial) {
            esPasswordFuerte = true;
        }

        return esPasswordFuerte;
    }

    public String getPassword() {
        return password;
    }
}