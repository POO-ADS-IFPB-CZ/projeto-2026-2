import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o código:");
    int codigo = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Informe a descrição:");
    String descricao = scanner.nextLine();
    System.out.println("Informe o preço:");
    float preco = scanner.nextFloat();
    scanner.nextLine();
    System.out.println("Informe o estoque:");
    int estoque = scanner.nextInt();
    scanner.nextLine();
}