package animal;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class trabalhog2_2 {
    public static void main(String[] args) throws IOException, InterruptedException {

    int menu, M, salvar = -1, t = 0;
    String quebra = System.getProperty("line.separator"), tela;
    Scanner Sc = new Scanner(System.in);
    boolean E = true, all = false;
    Cobra cobra = new Cobra();
    ArrayList<Cobra> cobral = new ArrayList<>();
    Ovelha ovelha = new Ovelha();
    ArrayList<Ovelha> ovelhal = new ArrayList<>();
    Jacare jacare = new Jacare();
    ArrayList<Jacare> jacarel = new ArrayList<>();
    Humano humano = new Humano();
    ArrayList<Humano> humanol = new ArrayList<>();

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

    case 1:{salvar=-1;
    System.out.print("1. salvar como proximo na lista"+quebra+"2. nao  salvar na lista"+quebra+quebra+"options: ");
    while(salvar != 1 && salvar !=2){
    salvar = Sc.nextInt();
    if (salvar !=1 && salvar !=2)
        System.out.print("use o cerebro, e digite uma opcao possivel, horse head: ");}
    System.out.print("escolha a especie: "+quebra+quebra+"1. Ovelha"+quebra+"2. Jacare"+quebra+"3. Cobra"+quebra+"4. Humano"+quebra+"0. Sair"+quebra+quebra+"qual opcao: ");
    menu = Sc.nextInt();
    if (salvar==1)
        salvar = menu;
    else
        salvar = -1;
    
    switch(menu){
        case 1:{ovelha = new Ovelha();
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
        case 2:{ jacare = new Jacare();
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
        case 3:{cobra = new Cobra();
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
        case 4:{humano = new Humano();   
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
        break;}
        
     switch(salvar){
         case 1: ovelhal.add(ovelha);
     break;
     
         case 2: jacarel.add(jacare);
     break;
     
         case 3: cobral.add(cobra);
     break;
     
         case 4: humanol.add(humano);
     break;
    }}
        break;

    case 2:{ t = -1;
        System.out.print("1. Ovelha"+quebra+"11. Ovaelhal"+quebra+"2. Jacare"+quebra+"22. Jacarel"+quebra+"3. Cobra"+quebra+"33. Cobral"+quebra+"4. Humano"+quebra+"44. Humanol"+quebra+"99. todos"+quebra+quebra+"options: ");
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
                        menu = 11;
                    else
                        break;}
            case 11:{if(all || ovelhal.isEmpty())
                        menu = 2;
                    else{
                    System.out.print("1. posicao especifica"+quebra+"2. todos"+quebra+quebra+"option: ");
                    while(menu != 1 && menu !=2){
                    menu = Sc.nextInt();
                    if (menu !=1 && menu !=2)
                        System.out.print("use o cerebro, e digite uma opcao possivel, horse head: ");
                    else
                        if(menu == 1){
                        System.out.print("qual posicao: ");
                        while(t < 0 || t > (ovelhal.size()-1)){
                        t = Sc.nextInt();
                        if (t < 0 || t > (ovelhal.size()-1))
                            System.out.print("use o cerebro, e digite uma posicao possivel, horse head: ");}}}}
                    
                    switch(menu){
                        case 1:
                            System.out.print("[ovelha"+", posicao: "+t+"]"+quebra+"nome: "+ovelhal.get(t).getNome()+quebra+"especie: "+ovelhal.get(t).getEspecie()+quebra+"habitat: "+ovelhal.get(t).getHabitat()+quebra+"tamanho: "+ovelhal.get(t).getTamanho()+quebra+"peso: "+ovelhal.get(t).getPeso()+quebra+"Temlan: "+ovelhal.get(t).getTemlan()+quebra+"N de mamas: "+ovelhal.get(t).getNumeromamas()+quebra+quebra);
                            break;
                        case 2:
                            for(t=0; t < ovelhal.size(); t++){
                            System.out.print("[ovelha"+", posicao: "+t+"]"+quebra+"nome: "+ovelhal.get(t).getNome()+quebra+"especie: "+ovelhal.get(t).getEspecie()+quebra+"habitat: "+ovelhal.get(t).getHabitat()+quebra+"tamanho: "+ovelhal.get(t).getTamanho()+quebra+"peso: "+ovelhal.get(t).getPeso()+quebra+"Temlan: "+ovelhal.get(t).getTemlan()+quebra+"N de mamas: "+ovelhal.get(t).getNumeromamas()+quebra+quebra);}}
                    if (all)
                        menu = 22;
                    else
                        break;}
            
            case 22:{if(all || jacarel.isEmpty())
                        menu = 2;
                    else{
                    System.out.print("1. posicao especifica"+quebra+"2. todos"+quebra+quebra+"option: ");
                    while(menu != 1 && menu !=2){
                    menu = Sc.nextInt();
                    if (menu !=1 && menu !=2)
                        System.out.print("use o cerebro, e digite uma opcao possivel, horse head: ");
                    else
                        if(menu == 1){
                        System.out.print("qual posicao: ");
                        while(t < 0 || t > (jacarel.size()-1)){
                        t = Sc.nextInt();
                        if (t < 0 || t > (jacarel.size()-1))
                            System.out.print("use o cerebro, e digite uma posicao possivel, horse head: ");}}}}
                    
                    switch(menu){
                        case 1:
                            System.out.print("[jacare"+", posicao: "+t+"]"+quebra+"nome: "+jacarel.get(t).getNome()+quebra+"especie: "+jacarel.get(t).getEspecie()+quebra+"habitat: "+jacarel.get(t).getHabitat()+quebra+"tamanho: "+jacarel.get(t).getTamanho()+quebra+"peso: "+jacarel.get(t).getPeso()+quebra+"N de garras: "+jacarel.get(t).getNumerogarras()+quebra+"N de patas: "+jacarel.get(t).getNumeropatas()+quebra+quebra);
                            break;
                        case 2:
                            for(t=0; t < jacarel.size(); t++){
                            System.out.print("[jacare"+", posicao: "+t+"]"+quebra+"nome: "+jacarel.get(t).getNome()+quebra+"especie: "+jacarel.get(t).getEspecie()+quebra+"habitat: "+jacarel.get(t).getHabitat()+quebra+"tamanho: "+jacarel.get(t).getTamanho()+quebra+"peso: "+jacarel.get(t).getPeso()+quebra+"N de garras: "+jacarel.get(t).getNumerogarras()+quebra+"N de patas: "+jacarel.get(t).getNumeropatas()+quebra+quebra);}}
                    if (all)
                        menu = 33;
                    else
                        break;}
            
            case 33:{if(all || cobral.isEmpty())
                        menu = 2;
                    else{
                    System.out.print("1. posicao especifica"+quebra+"2. todos"+quebra+quebra+"option: ");
                    while(menu != 1 && menu !=2){
                    menu = Sc.nextInt();
                    if (menu !=1 && menu !=2)
                        System.out.print("use o cerebro, e digite uma opcao possivel, horse head: ");
                    else
                        if(menu == 1){
                        System.out.print("qual posicao: ");
                        while(t < 0 || t > (cobral.size()-1)){
                        t = Sc.nextInt();
                        if (t < 0 || t > (cobral.size()-1))
                            System.out.print("use o cerebro, e digite uma posicao possivel, horse head: ");}}}}
                    
                    switch(menu){
                        case 1:
                            System.out.print("[cobra"+", posicao: "+t+"]"+quebra+"nome: "+cobral.get(t).getNome()+quebra+"especie: "+cobral.get(t).getEspecie()+quebra+"habitat: "+cobral.get(t).getHabitat()+quebra+"tamanho: "+cobral.get(t).getTamanho()+quebra+"peso: "+cobral.get(t).getPeconheta()+quebra+"peconheta: "+cobral.get(t).getPeconheta()+quebra+"N de patas: "+cobral.get(t).getNumeropatas()+quebra+quebra);
                            break;
                        case 2:
                            for(t=0; t < cobral.size(); t++){
                            System.out.print("[cobra"+", posicao: "+t+"]"+quebra+"nome: "+cobral.get(t).getNome()+quebra+"especie: "+cobral.get(t).getEspecie()+quebra+"habitat: "+cobral.get(t).getHabitat()+quebra+"tamanho: "+cobral.get(t).getTamanho()+quebra+"peso: "+cobral.get(t).getPeconheta()+quebra+"peconheta: "+cobral.get(t).getPeconheta()+quebra+"N de patas: "+cobral.get(t).getNumeropatas()+quebra+quebra);}}
                    if (all)
                        menu = 44;
                    else
                        break;}
            
            case 44:{if(all || humanol.isEmpty())
                        menu = 2;
                    else{
                    System.out.print("1. posicao especifica"+quebra+"2. todos"+quebra+quebra+"option: ");
                    while(menu != 1 && menu !=2){
                    menu = Sc.nextInt();
                    if (menu !=1 && menu !=2)
                        System.out.print("use o cerebro, e digite uma opcao possivel, horse head: ");
                    else
                        if(menu == 1){
                        System.out.print("qual posicao: ");
                        while(t < 0 || t > (humanol.size()-1)){
                        t = Sc.nextInt();
                        if (t < 0 || t > (humanol.size()-1))
                            System.out.print("use o cerebro, e digite uma posicao possivel, horse head: ");}}}}
                    
                    switch(menu){
                        case 1:
                            System.out.print("[humano"+", posicao: "+t+"]"+quebra+"nome: "+humanol.get(t).getNome()+quebra+"especie: "+humanol.get(t).getEspecie()+quebra+"habitat: "+humanol.get(t).getHabitat()+quebra+"tamanho: "+humanol.get(t).getTamanho()+quebra+"peso: "+humanol.get(t).getPeso()+quebra+"qi: "+humanol.get(t).getQi()+quebra+"N de mamas: "+humanol.get(t).getNumeromamas()+quebra+quebra);
                            break;
                        case 2:
                            for(t=0; t < humanol.size(); t++){
                            System.out.print("[humano"+", posicao: "+t+"]"+quebra+"nome: "+humanol.get(t).getNome()+quebra+"especie: "+humanol.get(t).getEspecie()+quebra+"habitat: "+humanol.get(t).getHabitat()+quebra+"tamanho: "+humanol.get(t).getTamanho()+quebra+"peso: "+humanol.get(t).getPeso()+quebra+"qi: "+humanol.get(t).getQi()+quebra+"N de mamas: "+humanol.get(t).getNumeromamas()+quebra+quebra);}}
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