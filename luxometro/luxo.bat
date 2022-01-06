start "C:\Program Files (x86)\HBT Interface - R" HBTInt-R.exe
exit


//------------//                
                if(hojaPruebas.getTestsheet()!=testSheet){
                    
                    testSheet = hojaPruebas.getTestsheet();
                    for(int a=0;a<23;a++){
                        registro[a]=fila[a];                    
                    } 
               
                }else{                   
                    for(int a=0;a<23;a++){
                        if(!registro[a].equals("")){
                            System.out.println(fila[a]+" : "+registro[a]);
                            fila[a]=registro[a];
                            System.out.println(fila[a]+" - "+registro[a]);
                        }else;                      
                    }
                    
                   
                    modelo.addRow(fila); 
                   
                    for(int a=0;a<23;a++){
                        fila[a]="";
                        registro[a]="";
                    }                    
                    testSheet=0;
                }
//------------------------------------------------------------------------------                
        }          
            tblGasolina.setModel(modelo);     
    }

sudo systemctl status mysqld

sudo mysqld_safe --skip-grant-tables &

mysql -u root mysql

systemctl restart mysqld

systemctl set-environment MYSQLD_OPTS="--skip-grant-tables" 

update user set authentication_string=password('50lt3l3c545') where user='root';

flush privileges;
exit;

systemctl unset-environment MYSQLD_OPTS