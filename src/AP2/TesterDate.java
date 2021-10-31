package AP2;

public class TesterDate {
    private Integer ano;
    private Integer mes;
    private Integer dia;
    private String dataFinal;

    public boolean isDate(String data) {
        ano = Integer.parseInt(data.substring(6, 10));
        mes = Integer.parseInt(data.substring(3, 5));
        dia = Integer.parseInt(data.substring(0, 2));

        if (ano <= 2021 && ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0))) {
            if (mes == 2) {
                if (dia > 0 && dia <= 29) {
                    this.dataFinal = data;
                    return true;
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia > 0 && dia <= 31) {
                    this.dataFinal = data;
                    return true;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 0 && dia <= 30) {
                    this.dataFinal = data;
                    return true;
                }
            } else {
                return false;
            }
        } else if (ano <= 2021) {
            if (mes == 2) {
                if (dia > 0 && dia <= 28) {
                    this.dataFinal = data;
                    return true;
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia > 0 && dia <= 31) {
                    this.dataFinal = data;
                    return true;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 0 && dia <= 30) {
                    this.dataFinal = data;
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
