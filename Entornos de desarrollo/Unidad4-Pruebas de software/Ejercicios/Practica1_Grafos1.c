begin
    int num=0,cont_pos=0,cont_neg=0,suma_pos=0,suma_neg=0;
    float media_pos=0,media_neg=0;
    System.out.print("Introduce número: ");
    num=Entrada.entero();

    while(num!=0)

        if(num>0)
            cont_pos++;
            suma_pos+=num;

        else
            cont_neg++;
            suma_neg+=num;
        endif;

        System.out.print("Introduce número: ");
        num=Entrada.entero();
    endwhile;

    if(cont_pos!=0)
        media_pos=(float)suma_pos/cont_pos;
        System.out.println("Media de los positivos: "+media_pos);
    endif;

    if(cont_neg!=0)
        media_neg=(float)suma_neg/cont_neg;
        System.out.println("Media de los negativos: "+media_neg);
    endif;
end;