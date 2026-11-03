import model.Aluno;

void main(){

    Set<Aluno> alunos = new TreeSet<>();
    alunos.add(new Aluno(123,"João"));
    alunos.add(new Aluno(321,"Maria"));
    alunos.add(new Aluno(123,"João"));
    alunos.add(new Aluno(234, "João"));
    System.out.println(alunos);
}