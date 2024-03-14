package dio.web.api.handler;

public class CamposObrigatoriosException  extends BusinessException{
    public CamposObrigatoriosException(String campo) { // recebemos um parametro campo
        super("O seguinte campo: %s. É obrigatório", campo);
    }

}
