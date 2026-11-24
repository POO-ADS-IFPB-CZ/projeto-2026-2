import model.Pessoa;

void main(){
    //Arquivo de texto
    File file = new File("aula.txt");
    if(!file.exists()) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Pessoa pessoa = new Pessoa("222.222.222-02",
            "Maria");

    try(BufferedWriter writer = new BufferedWriter(
            new FileWriter(file, true)
    )){
        writer.write(pessoa.getCpf());
        writer.write(",");
        writer.write(pessoa.getNome());
        writer.newLine();
    }catch (IOException ex){
        System.out.println("Falha ao manipular arquivo");
    }


}