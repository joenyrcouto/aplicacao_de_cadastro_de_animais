package animal;
import java.io.IOException;
import java.util.Scanner;

public class trabalhog2 {
    public static void main(String[] args) throws IOException, InterruptedException {

    int menu,M;
    String quebra = System.getProperty("line.separator"), tela;
    Scanner Sc = new Scanner(System.in);
    boolean E = true, all = false;
    Cobra cobra = new Cobra();
    Ovelha ovelha = new Ovelha();
    Jacare jacare = new Jacare();
    Humano humano = new Humano();

    while(E){

        tela = "n";
        System.out.print("caso apareca outro input, envie novamente, limpar tela?(s/n(or any other)): ");
        tela = Sc.nextLine();
        tela = Sc.nextLine();
        
        if (tela.equals("s"))
            limpatela();
        M = -1;
        System.out.print("1. Por informacoes dos animais"+quebra+"2. Ver informacoes dos animais"+quebra+"0. Sair"+quebra+quebra+"options: ");
        M = Sc.nextInt();
        limpatela();
        
switch(M){

    case 1:{
    System.out.print("escolha a especie: "+quebra+quebra+"1. Ovelha"+quebra+"2. Jacare"+quebra+"3. Cobra"+quebra+"4. Humano"+quebra+"0. Sair"+quebra+quebra+"qual opcao: ");
    menu = Sc.nextInt();

    switch(menu){
        case 1:{
            // switch escolha 
            System.out.print("1. nome"+quebra+"2. especie"+quebra+"3. habitat"+quebra+"4. tamanho"+quebra+"5. peso"+quebra+"6. Temlan"+quebra+"7. N de mamas"+quebra+"99. todos"+quebra+"0. sair"+quebra+quebra+"options: ");
            menu = Sc.nextInt();
            if (menu == 99){
            menu = 1;
            all = true;
            System.out.println("Obs.: coloque cada informacao duas vezes pra confirmar, e a segunda que sera valida."+quebra);}
            switch(menu){
                case 1:{
    System.out.print("nome: ");
    if (all)
        ovelha.setNome(Sc.nextLine());
    ovelha.setNome(Sc.nextLine());
    ovelha.setNome(Sc.nextLine());
            if (all)
                        menu = 2;
                    else
                        break;}
    
                case 2:{
    System.out.print("especie: ");
    ovelha.setEspecie(Sc.nextLine());
    ovelha.setEspecie(Sc.nextLine());
                if (all)
                        menu = 3;
                    else
                        break;}
    
                case 3:{
    System.out.print("habitat: ");
    ovelha.setHabitat(Sc.nextLine());
    ovelha.setHabitat(Sc.nextLine());
                if (all)
                        menu = 4;
                    else
                        break;}
    
                case 4:{
    System.out.print("tamanho: ");
    ovelha.setTamanho(Sc.nextLine());
    ovelha.setTamanho(Sc.nextLine());
                if (all)
                        menu = 5;
                    else
                        break;}
    
                case 5:{
    System.out.print("peso: ");
    humano.setPeso(Sc.nextLine());
    humano.setPeso(Sc.nextLine());
                if (all)
                        menu = 6;
                else
                    break;}
                
                case 6:{
    System.out.print("temlan(true/false): ");
    ovelha.setTemlan(Sc.nextLine());
    ovelha.setTemlan(Sc.nextLine());
                if (all)
                        menu = 7;
                else
                    break;}
                
                case 7:{
    System.out.print("N de mamas: ");
    ovelha.setNumeromamas(Sc.nextInt());
    ovelha.setNumeromamas(Sc.nextInt());
                if (all)
                        all = false;
                else
                    break;}}}
        break;
        case 2:{
                // switch escolha 
            System.out.print("1. nome"+quebra+"2. especie"+quebra+"3. habitat"+quebra+"4. tamanho"+quebra+"5. peso"+quebra+"6. N de garras"+quebra+"7. N de patas"+quebra+"99. todos"+quebra+"0. sair"+quebra+quebra+"options: ");
            menu = Sc.nextInt();
            if (menu == 99){
            menu = 1;
            all = true;
            System.out.println("Obs.: coloque cada informacao duas vezes pra confirmar, e a segunda que sera valida."+quebra);}
            switch(menu){
                case 1:{
    System.out.print("nome: ");
    if (all)
        jacare.setNome(Sc.nextLine());
    jacare.setNome(Sc.nextLine());
    jacare.setNome(Sc.nextLine());
            if (all)
                        menu = 2;
                    else
                        break;}
    
                case 2:{
    System.out.print("especie: ");
    jacare.setEspecie(Sc.nextLine());
    jacare.setEspecie(Sc.nextLine());
                if (all)
                        menu = 3;
                    else
                        break;}
    
                case 3:{
    System.out.print("habitat: ");
    jacare.setHabitat(Sc.nextLine());
    jacare.setHabitat(Sc.nextLine());
                if (all)
                        menu = 4;
                    else
                        break;}
    
                case 4:{
    System.out.print("tamanho: ");
    jacare.setTamanho(Sc.nextLine());
    jacare.setTamanho(Sc.nextLine());
                if (all)
                        menu = 5;
                    else
                        break;}
    
                case 5:{
    System.out.print("peso: ");
    jacare.setPeso(Sc.nextLine());
    jacare.setPeso(Sc.nextLine());
                if (all)
                        menu = 6;
                else
                    break;}
                
                case 6:{
    System.out.print("Numero de garras: ");
    jacare.setNumerogarras(Sc.nextInt());
    jacare.setNumerogarras(Sc.nextInt());
                if (all)
                        menu = 7;
                else
                    break;}
                
                case 7:{
    System.out.print("Numero de patas: ");
    jacare.setNumeropatas(Sc.nextInt());
    jacare.setNumeropatas(Sc.nextInt());
                if (all)
                        all = false;
                else
                    break;}}}
        break;
        case 3:{
            // switch escolha 
            System.out.print("1. nome"+quebra+"2. especie"+quebra+"3. habitat"+quebra+"4. tamanho"+quebra+"5. peso"+quebra+"99. todos"+quebra+"0. sair"+quebra+quebra+"options: ");
            menu = Sc.nextInt();
            if (menu == 99){
            menu = 1;
            all = true;
            System.out.println("Obs.: coloque cada informacao duas vezes pra confirmar, e a segunda que sera valida."+quebra);}
            switch(menu){
                case 1:{
    System.out.print("nome: ");
    if (all)
        cobra.setNome(Sc.nextLine());
    cobra.setNome(Sc.nextLine());
    cobra.setNome(Sc.nextLine());
            if (all)
                        menu = 2;
                    else
                        break;}
    
                case 2:{
    System.out.print("especie: ");
    cobra.setEspecie(Sc.nextLine());
    cobra.setEspecie(Sc.nextLine());
                if (all)
                        menu = 3;
                    else
                        break;}
    
                case 3:{
    System.out.print("habitat: ");
    cobra.setHabitat(Sc.nextLine());
    cobra.setHabitat(Sc.nextLine());
                if (all)
                        menu = 4;
                    else
                        break;}
    
                case 4:{
    System.out.print("tamanho: ");
    cobra.setTamanho(Sc.nextLine());
    cobra.setTamanho(Sc.nextLine());
                if (all)
                        menu = 5;
                    else
                        break;}
    
                case 5:{
    System.out.print("peso: ");
    cobra.setPeso(Sc.nextLine());
    cobra.setPeso(Sc.nextLine());
                if (all)
                        menu = 6;
                else
                    break;}
                
                case 6:{
    System.out.print("Numero de garras: ");
    cobra.setPeconheta(Sc.nextLine());
    cobra.setPeconheta(Sc.nextLine());
                if (all)
                        menu = 7;
                else
                    break;}
                
                case 7:{
    System.out.print("Numero de patas: ");
    cobra.setNumeropatas(Sc.nextInt());
    cobra.setNumeropatas(Sc.nextInt());
                if (all)
                        all = false;
                else
                    break;}}}
        break;
        case 4:{          
                // switch escolha 
            System.out.print("1. nome"+quebra+"2. especie"+quebra+"3. habitat"+quebra+"4. tamanho"+quebra+"5. peso"+quebra+"6. N de mama"+quebra+"7. qi"+quebra+"99. todos"+quebra+"0. sair"+quebra+quebra+"options: ");
            menu = Sc.nextInt();
            if (menu == 99){
            menu = 1;
            all = true;
            System.out.println("Obs.: coloque cada informacao duas vezes pra confirmar, e a segunda que sera valida."+quebra);}
            switch(menu){
                case 1:{
    System.out.print("nome: ");
    if (all)
        humano.setNome(Sc.nextLine());
    humano.setNome(Sc.nextLine());
    humano.setNome(Sc.nextLine());
            if (all)
                        menu = 2;
                    else
                        break;}
    
                case 2:{
    System.out.print("especie: ");
    humano.setEspecie(Sc.nextLine());
    humano.setEspecie(Sc.nextLine());
                if (all)
                        menu = 3;
                    else
                        break;}
    
                case 3:{
    System.out.print("habitat: ");
    humano.setHabitat(Sc.nextLine());
    humano.setHabitat(Sc.nextLine());
                if (all)
                        menu = 4;
                    else
                        break;}
    
                case 4:{
    System.out.print("tamanho: ");
    humano.setTamanho(Sc.nextLine());
    humano.setTamanho(Sc.nextLine());
                if (all)
                        menu = 5;
                    else
                        break;}
    
                case 5:{
    System.out.print("peso: ");
    humano.setPeso(Sc.nextLine());
    humano.setPeso(Sc.nextLine());
                if (all)
                        menu = 6;
                else
                    break;}
                
                case 6:{
    System.out.print("qi: ");
    humano.setQi(Sc.nextInt());
    humano.setQi(Sc.nextInt());
                if (all)
                        menu = 7;
                else
                    break;}
                
                case 7:{
    System.out.print("N de mamas: ");
    humano.setNumeromamas(Sc.nextInt());
    humano.setNumeromamas(Sc.nextInt());
                if (all)
                        all = false;
                else
                    break;}
            
            }}
        break;}}
        break;

    case 2:{
        System.out.print("1. Ovelha"+quebra+"2. Jacare"+quebra+"3. Cobra"+quebra+"4. Humano"+quebra+"99. todos"+quebra+quebra+"options: ");
        menu = Sc.nextInt();
        if (menu == 99){
            menu = 1;
            all = true;}
        switch(menu){
            case 1:{System.out.print("[ovelha]"+quebra+"nome: "+ovelha.getNome()+quebra+"especie: "+ovelha.getEspecie()+quebra+"habitat: "+ovelha.getHabitat()+quebra+"tamanho: "+ovelha.getTamanho()+quebra+"peso: "+ovelha.getPeso()+quebra+"Temlan: "+ovelha.getTemlan()+quebra+"N de mamas: "+ovelha.getNumeromamas()+quebra+quebra);
                    if (all)
                        menu = 2;
                    else
                        break;}
            case 2:{System.out.print("[jacare]"+quebra+"nome: "+jacare.getNome()+quebra+"especie: "+jacare.getEspecie()+quebra+"habitat: "+jacare.getHabitat()+quebra+"tamanho: "+jacare.getTamanho()+quebra+"peso: "+jacare.getPeso()+quebra+"N de garras: "+jacare.getNumerogarras()+quebra+"N de patas: "+jacare.getNumeropatas()+quebra+quebra);
                    if (all)
                        menu = 3;
                    else
                        break;}
            case 3:{System.out.print("[cobra]"+quebra+"nome: "+cobra.getNome()+quebra+"especie: "+cobra.getEspecie()+quebra+"habitat: "+cobra.getHabitat()+quebra+"tamanho: "+cobra.getTamanho()+quebra+"peso: "+cobra.getPeconheta()+quebra+"peconheta: "+cobra.getPeconheta()+quebra+"N de patas: "+cobra.getNumeropatas()+quebra+quebra);
                    if (all)
                        menu = 4;
                    else
                        break;}
            case 4:{System.out.print("[humano]"+quebra+"nome: "+humano.getNome()+quebra+"especie: "+humano.getEspecie()+quebra+"habitat: "+humano.getHabitat()+quebra+"tamanho: "+humano.getTamanho()+quebra+"peso: "+humano.getPeso()+quebra+"qi: "+humano.getQi()+quebra+"N de mamas: "+humano.getNumeromamas()+quebra+quebra);
                    if (all)
                        all = false;}
        }}
        
        break;

    case 0: E = false;
        break;
    }
    }}

public static void limpatela() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows"))
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
        {System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");}
}}