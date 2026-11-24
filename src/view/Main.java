import model.Pessoa;

void main(){
    //Arquivo de texto
    File file = new File("aula-binario");
    if(!file.exists()) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Set<Pessoa> pessoas = new HashSet<>();
    pessoas.add(new Pessoa("111.111.111-01", "João"));
    pessoas.add(new Pessoa("222.222.222-02", "Maria"));

    try(ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream(file)
    )){
        out.writeObject(pessoas);
    } catch (IOException e) {
        System.out.println("Falha ao manipular arquivo");
    }


}