    private static double ortalama[][] = new double[8][2];
    private static double zdeger=0,so=0,ss=0,vize=0,sondeger=0;
    int i;
    //
    //z = ((vize+final)/2-ortalama)/sapma*10+50
    //(((z-50)/10)*sapma+ortalama)*2-vize=final
    //
       zdeger=0;so=0;ss=0;vize=0;sondeger=0;
        String a= jComboBox1.getSelectedItem().toString();
        alZdeger(a);
        try
        {
        vize=Double.parseDouble( jTextField1.getText());
        so=Double.parseDouble( jTextField2.getText());
        ss=Double.parseDouble( jTextField3.getText());
        for(i=0;i<8;i++)
        {
            if((double)so <= ortalama[i][0])
            {
                zdeger += ortalama[i][1];
                sondeger = (((zdeger-50)/10)*ss+so)*2-vize ;
                jLabel4.setFont(new java.awt.Font("DialogInput", 0, 18));
                jLabel4.setText("Almanız gereken not : " + sondeger);
                
                break;
            }
        }
        }
        catch(Exception e)
        {
             jLabel4.setFont(new java.awt.Font("DialogInput", 0, 18));
             jLabel4.setText("lütfen değerlerin hepsini ve sayı olarak girin");
        }
    private static void setortalama()
    {
            ortalama[0][0] = 42.5;
            ortalama[1][0] = 47.5;
            ortalama[2][0] = 52.5;
            ortalama[3][0] = 57.5;
            ortalama[4][0] = 62.5;
            ortalama[5][0] = 70;
            ortalama[6][0] = 80;
            ortalama[7][0] = 100;
            ortalama[0][1] = 36.1;
            ortalama[1][1] = 34.1;
            ortalama[2][1] = 32.1;
            ortalama[3][1] = 30.1;
            ortalama[4][1] = 28.1;
            ortalama[5][1] = 26.1;
            ortalama[6][1] = 24.1;
            ortalama[7][1] = 22.1;
    }
    private static void alZdeger(String a)
    {
        if(a=="FD")
        {
            zdeger=0;
        }
        else if(a=="DD")
        {
            zdeger=5;
        }
        else if(a=="DC")
        {
            zdeger=10;
        }
        else if(a=="CC")
        {
            zdeger=15;
        }
        else if(a=="CB")
        {
            zdeger=20;
        }
        else if(a=="BB")
        {
            zdeger=25;
        }
        else if(a=="BA")
        {
            zdeger=30;
        }
        else if(a=="AA")
        {
            zdeger=35;
        }
    }
