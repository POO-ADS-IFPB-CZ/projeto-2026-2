void main() {

    try(BufferedReader reader = new BufferedReader(
            new FileReader("Teste.txt")
    )){
        System.out.println(reader.readLine());
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}