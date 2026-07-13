import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Universidad universidad = new Universidad ("UTT", new Direccion("Matamoros", 3433, 78777 ));
    public static void main(String[] args) {

        int opcion;
        do{
            System.out.println("===UNIVERSIDAD");
            System.out.println("1. Agregar Alumo");
            System.out.println("2. Agregar Grupo");
            System.out.println("3. Asignar Alumno a grupo");
            System.out.println("4. Asignar Grupo a universidad");
            System.out.println("5. Agregar materia");
            System.out.println("6. Asiganr materia a alumno");
            System.out.println("7. salir del programa");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("ingrese la matricula del alumno");
                    String mat = sc.next();
                    System.out.println("ingrese el nombre del alumno");
                    String nom = sc.next();
                    System.out.println("ingrese el apellido paterno del alumno");
                    String ap = sc.next();
                    System.out.println("ingrese el apellido materno del alumno");
                    String am = sc.next();
                    System.out.println("ingrese el numero del alumno ");
                    int num = sc.nextInt();
                    System.out.println("ingrse el correo del alumno");
                    String correo = sc.next();
                    System.out.println("ingreese el sexo del alumno");
                    String sexo = sc.next();
                    Alumno a = new Alumno(mat, nom, ap, am, num, correo, sexo);
                    Catalogo.alumnos.add(a);
                    System.out.println("alumno agregado correctamente");
                    break;

                case 2:
                    System.out.println("ingresa el grado: ");
                    int grado = sc.nextInt();
                    System.out.println("ingresa la seccion: ");
                    char seccion = sc.next().charAt(0);
                    System.out.println("ingresa el turno M/N: ");
                    String turno = sc.next();
                    Grupo g = new Grupo(grado, seccion, turno);
                    Catalogo.grupos.add(g);
                    break;

                case 3:
                    if (Catalogo.alumnos.isEmpty()){
                        System.out.println("lista de alumnos vacia");
                        break;
                    }
                    if(universidad.getGrupos().isEmpty()){
                        System.out.println("lista de grupos vacia");
                        break;
                    }
                    System.out.println("Lista de alumnos");
                    int i =0;
                    for(Alumno alumno1 : Catalogo.alumnos){
                        System.out.println("Alumno " + i + ":" + alumno1.toString());
                        i++;
                    }
                    System.out.println("selecciona al alumno: ");
                    int alumnoindice= sc.nextInt();

                    System.out.println("Lista de grupos");
                    int j =0;
                    for (Grupo grupo1 : universidad.getGrupos()){
                        System.out.println("Grupo " + j + ": " + grupo1.toString());
                        j++;
                    }

                    System.out.println("selecciona al grupo: ");
                    int grupoindice= sc.nextInt();

                    universidad.getGrupos().get(grupoindice).agregarAlumno(Catalogo.alumnos.get(alumnoindice));
                    System.out.println("alumno agregado correctamente");
                    break;

                case 4:
                    if (Catalogo.grupos.isEmpaty()){
                        System.out.println("no hay grupos");
                        break;
                    }
                    System.out.println("Lista de grupos");
                    int gruposindice= 0;
                    for (Grupo grupo1 : Catalogo.grupos){
                        System.out.println("Grupo" + gruposindice + ": " +grupo1.toString());
                        gruposindice++;
                    }
                    System.out.println("Selecciona el grupo: ");
                    int grupoindice1 = sc.nextInt();
                    universidad.AgregarGrupo(Catalogo.grupos.get(grupoindice1));
                    System.out.println("grupo agregado correctamente a: " + universidad.nombre + " ");
                    break;

                case 5:
                    System.out.println("ingrese el nombre de la materia");
                    String materia = sc.next();
                    System.out.println("ingrese la califiacion: ");
                    int calificacion = sc.nextInt();
                    System.out.println("ingrese el nombre del profesor");
                    String nombre = sc.next();
                    System.out.println("ingrese la edad del profesor: ");
                    int edad = sc.nextInt();
                    System.out.println("ingrese la especialidad del profesor: ");
                    String especialidad = sc.next();
                    Materia materia2 = new Materia(materia, calificacion, new Profesor(nombre,edad,especialidad));
                    Catalogo.materias.add(materia2);
                    System.out.println("materia agregada correctamente");
                    break;

                case 6:
                    if(universidad.getGrupos().isEmpty()){
                        System.out.println("no hay grupos");
                        break;
                    }
                    if(Catalogo.materias.isEmpty()){
                        System.out.println("no hya materias");
                        break;
                    }
                    System.out.println("Lista de grupos en la universidad");
                    int indicegrupouni =0;
                    for(Grupo g1 : universidad.getGrupos()){
                        System.out.println("Grupos: " + indicegrupouni + ": " + g1.toString());
                        indicegrupouni++;
                    }
                    System.out.println("Selecciona el grupo: ");
                    int grupoindice2 = sc.nextInt();

                    if(universidad.getGrupos().get(grupoindice2).getAlumno().isEmpty()){
                        System.out.println("no hay alumnos");
                        break;
                    }
                    System.out.println("Alumos del grupo: ");
                    int indicealumno = 0;
                    for(Alumno alumno1 : universidad.getGrupos().get(grupoindice2).getAlumnos()){
                        System.out.println("Alumno " + indicealumno + ": " + alumno1.toString());
                        indicealumno++;
                    }
                    System.out.println("Selecciona el alumno: ");
                    int indicealumno1 = sc.nextInt();

                    System.out.println("Materias: ");
                    int materiaindice =0;
                    for(Materia materia1 : Catalogo.materias){
                        System.out.println("Materia " + materiaindice + ": " + materia1.toString());
                        materiaindice++;
                    }
                    System.out.println("Selecciona la materia: ");
                    int materia1 = sc.nextInt();

                    universidad.getGrupos().get(grupoindice2).getAlumnos().get(indicealumno1)AgregarMateria(Catalogo.materias.get(materia1));
                    System.out.println("Al alumno se le asigno la materia");
                    break;




            }
        }while(opcion !=7);
    }
}