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

    try(ObjectInputStream in = new ObjectInputStream(
            new FileInputStream(file)
    )){
        Set<Pessoa> pessoas = (Set<Pessoa>) in.readObject();
        System.out.println(pessoas);
    } catch (IOException e) {
        System.out.println("Falha ao manipular arquivo");
    } catch (ClassNotFoundException e) {
        System.out.println("Falha na conversão");
    }


}