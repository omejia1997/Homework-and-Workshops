#include<cstdlib>
#include<iostream>
#include<fstream>
 #include <stdio.h>  
 #include <windows.h>  
#include<string.h>
#include<time.h>
using namespace std;
void altas();
void bajas();
void horario();
void consultas();
void modificaciones();
void lecturahorario();
void elecciondeho();
void vistabloques();
void bloques();
void salir();
void menu();
 void gotoxy(int x,int y);
//
struct asignacion{
	char nombre[30],grupo[10];
	char auxGrupo[10];
	int semestre=0, edad=0, clave=0, auxClave=0;
	string horario;
};
//Variables Globales

asignacion as;

bool encontrado=false;

int main(){
    menu();
    return 0;
    system("PAUSE");
}
void menu(){
    int opcion=0;
    do{
        cout<<"                     LABARATORIOS ESPE 2018-2019"<<endl;
        cout<<"1. Asignacion de aulas"<<endl;
        cout<<"2. Verificar Datos"<<endl;
        cout<<"3. Consultas"<<endl;

        cout<<"Que deseas hacer? ";
        cin>>opcion;
        switch(opcion){
            case 1:
            	system("cls");
                altas();
            break;
            case 2:
                //bajas();
            break;
            case 3:
                //consultas();
            break;
            case 4:
                //buscar();
            break;
            case 5:
                //modificaciones();
            break;
            case 6:
               // salir();
            break;
            default:
                cout<<"¡Opcion Incorrecta!"<<endl;
        }
    }while(opcion!=6);
}//Fin funcion menu
void altas(){
    ofstream escritura;
    ifstream consulta;
    bool repetido=false;
    escritura.open("registro",ios::out|ios::app);
    consulta.open("registro",ios::in);
    if(escritura.is_open() && consulta.is_open()){
    		cout<<"                      ASIGNACION DEL AULA"<<endl<<"          "<<endl;
        cout<<"Ingrese NRC: "<<endl;
        cin>>as.auxClave;
        cout<<"      "<<endl;
        consulta>>as.clave;
        while(!consulta.eof()){
            consulta>>as.nombre>>as.edad;
            if(as.clave==as.auxClave){
                cout<<"Ya Existe un Registro con esta Clave"<<endl;
                repetido=true;
                break;
            }
            consulta>>as.clave;
        }
        if(repetido==false){
        
            cout<<"Nombre del Docente:  "<<endl;
            cin>>as.nombre;
             cout<<"      "<<endl;
             cout<<"Edad: "<<endl;
            cin>>as.edad;          
            system("cls");
            horario();
            lecturahorario();
            elecciondeho();
            system("cls");
            bloques();
            vistabloques();
            system("pause");
            escritura<<as.auxClave<<"   "<<as.nombre<<" "<<as.edad<<"   "<<as.horario;
            /*gotoxy(1,11);
            /*cout<<"Agregando....."<<endl;
            
            for(int i=1;i<=75;i++) {
            	Sleep(12);
            	gotoxy(i,12);
            	cout<<"Ü";
			}
			cout<<endl;
			cout<<"Registro Ageragado"<<endl;
			system("pause");
			system("cls");*/
            
        }

    }else{
        cout<<"Error, el Archivo No se Pudo Abrir o No ha sido Creado"<<endl;
    }
    escritura.close();
    consulta.close();
}//Fin funcion altas



void horario(){
	ofstream horarios;
	horarios.open("horarios",ios::out);
	if(horarios.is_open()){
		horarios<<"1.- 7:15 - 9:15"<<endl;
		horarios<<"2.- 9:30 - 11:30"<<endl;
		horarios<<"3.- 12:00 - 14:00"<<endl;
		horarios<<"4.- 15:00 - 17:00"<<endl;
		horarios<<"5.- 17:15 - 19:15"<<endl;
		horarios<<"6.- 19:30 - 21:30"<<endl;	
		
	}else{
		cout<<"No existe el archivo"<<endl;
		exit(1);
	}
	horarios.close();
	
}
//llamada alos horairos
void lecturahorario(){
	ifstream horariol;
	string copy;
	horariol.open("horarios",ios::in);
	if(horariol.is_open()){
	cout<<"                      HORARIOS"<<endl;
	while(!horariol.eof()){
	getline(horariol,copy);
	   
	
		cout<<copy<<endl;		
			
	}

}else{
	cout<<"El archivo no existe"<<endl;
	
}
horariol.close();


}
void elecciondeho(){
	int op;
	cout<<"Que horario desea: "<<endl,
	cin>>op;
	switch(op){
	     	case 1:
			as.horario="7:15 - 9:15";
			break;
			case 2:
			as.horario="9:30 - 11:30";
			break;
			case 3:
			as.horario="12:00 - 14:00";
			break;
			case 4:
			as.horario="15:00 - 17:00";
			break;
			case 5:
			as.horario="17:15 - 19:15";
			break;
			case 6:
			as.horario="19:30 - 21:30";
			break;		
	}
	
}
void bloques(){
ofstream bloques;
bloques.open("bloques",ios::out);
if(bloques.is_open()){
 bloques<<" __________________________________                     ______________________________________  "<<endl;
 bloques<<" |"<<"           BLOQUE G            |                 |             BLOQUE H                 | "<<endl;
 bloques<<" |"<<"_______________________________|                 |______________________________________| "<<endl;
 bloques<<" |"<<"Piso 1     Piso 2       Piso3  |                 |  Piso 1      Piso 2     Piso3        | "<<endl;
 bloques<<" |"<<"1.G201     7. G207      13.G213|                 |  19.HO1      25.HO2     31.HO3       | "<<endl;
 bloques<<" |"<<"2.G202     8. G208      14.G214|                 |  20.HO1      26.HO2     32.HO3       | "<<endl;
 bloques<<" |"<<"3.G203     9. G209      15.G215|                 |  21.HO1      22.HO2     33.HO3       | "<<endl;
 bloques<<" |"<<"4.G204     10.G210      16.G216|                 |  22.HO1      28.HO2     34.HO3       | "<<endl;
 bloques<<" |"<<"5.G205     11.G211      17.G217|                 |  23.HO1      29.HO2     35.HO3       | "<<endl;
 bloques<<" |"<<"6.G206     12.G212      18.G218|                 |  24.HO1      30.HO2     36.HO3       | "<<endl;
 bloques<<" |_________________________________  |                 |______________________________________| "<<endl;
     
	       
	
}
	
	
bloques.close();	
	
}
void vistabloques(){
	ifstream lecbloques;
	string papu;
	lecbloques.open("bloques",ios::in);
	if(lecbloques.is_open()){
	cout<<"                      HORARIOS"<<endl;
	while(!lecbloques.eof()){
	getline(lecbloques,papu);
	   
	
		cout<<papu<<endl;		
			
	}

}else{
	cout<<"El archivo no existe"<<endl;
	
}
lecbloques.close();


}









 void gotoxy(int x,int y){  
      HANDLE hcon;  
      hcon = GetStdHandle(STD_OUTPUT_HANDLE);  
      COORD dwPos;  
      dwPos.X = x;  
      dwPos.Y= y;  
      SetConsoleCursorPosition(hcon,dwPos);  
 }  

	

