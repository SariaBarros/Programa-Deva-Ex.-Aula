public class ServicoUsuarioU {
    public static void print(String nome, CallBack callBack) {
        callBack.call(nome + "pronto");
    }

    public static void main(String[] args) {
        print("Sandy", new CallBack() {
            @Override
            public void call(String call) {
                System.out.println(call);
            }
        });
    }
}
