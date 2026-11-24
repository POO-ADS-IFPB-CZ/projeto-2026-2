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

    try(BufferedReader reader = new BufferedReader(
            new FileReader(file)
    )){
        List<String> linhas = reader.readAllLines();
        for(String linha : linhas){
            String dados[] = linha.split(",");
            Pessoa pessoa = new Pessoa(dados[0],dados[1]);
            System.out.println(pessoa);
        }
    }catch (IOException ex){
        System.out.println("Falha ao manipular arquivo");
    }


}