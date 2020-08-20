sort=input("what sort (use full caps)\n")
if sort!="BOGO":
    first,second,third,fourth,fifth=int(input("what number in pos 1 (either 1/2 digits) \n")),int(input("what number in pos 2\n")),int(input("what number in pos 3\n")),int(input("what number in pos 4\n")),int(input("what number in pos 5\n"))
if first<10:
    tens1=0
    units1=int((str(first)[0]))
else:
    tens1=int((str(first)[0]))
    units1=int((str(first)[1]))
if second<10:
    tens2=0
    units2=int((str(second)[0]))
else:
    tens2=int((str(second)[0]))
    units2=int((str(second)[1]))
if third<10:
    tens3=0
    units3=int((str(third)[0]))
else:
    tens3=int((str(third)[0]))
    units3=int((str(third)[1]))
if fourth<10:
    tens4=0
    units4=int((str(fourth)[0]))
else:
    tens4=int((str(fourth)[0]))
    units4=int((str(fourth)[1]))
if fifth<10:
    tens5=0
    units5=int((str(fifth)[0]))
else:
    tens5=int((str(fifth)[0]))
    units5=int((str(fifth)[1]))
if sort=="MERGE":
    e=int(input("last digit of serial number:"))
sor1,sor2,sor3,sor4,sor5=first,second,third,fourth,fifth
while sor1 > sor2 or sor2 > sor3 or sor3 > sor4 or sor4 > sor5 and sort!="BOGO":
    if sor1 > sor2:
        temp10 = sor1
        sor1 = sor2
        sor2 = temp10
        temp10 = 0
    if sor2 > sor3:
        temp10 = sor2
        sor2 = sor3
        sor3 = temp10
        temp10 = 0
    if sor3 > sor4:
        temp10 = sor3
        sor3 = sor4
        sor4 = temp10
        temp10 = 0
    if sor4 > sor5:
        temp10 = sor4
        sor4 = sor5
        sor5 = temp10
        temp10 = 0
    if sor3 > sor4:
        temp10 = sor3
        sor3 = sor4
        sor4 = temp10
        temp10 = 0
    if sor2 > sor3:
        temp10 = sor2
        sor2 = sor3
        sor3 = temp10
        temp10 = 0
if sor1<10:
    tensor1=0
    unitsor1=int((str(sor1)[0]))
else:
    tensor1=int((str(sor1)[0]))
    unitsor1=int((str(sor1)[1]))
if sor2<10:
    tensor2=0
    unitsor2=int((str(sor2)[0]))
else:
    tensor2=int((str(sor2)[0]))
    unitsor2=int((str(sor2)[1]))
if sor3<10:
    tensor3=0
    unitsor3=int((str(sor3)[0]))
else:
    tensor3=int((str(sor3)[0]))
    unitsor3=int((str(sor3)[1]))
if sor4<10:
    tensor4=0
    unitsor4=int((str(sor4)[0]))
else:
    tensor4=int((str(sor4)[0]))
    unitsor4=int((str(sor4)[1]))
if sor5<10:
    tensor5=0
    unitsor5=int((str(sor5)[0]))
else:
    tensor5=int((str(sor5)[0]))
    unitsor5=int((str(sor5)[1]))
temp1=temp2=0
if sort=="BUBBLE":
  while first>second or second>third or third>fourth or fourth>fifth:
    if first>second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if second>third:
      temp1=second
      second=third
      third=temp1
      temp1=0
      print("swap 2 3")
    if third>fourth:
      temp1=third
      third=fourth
      fourth=temp1
      temp1=0
      print("swap 3 4")
    if fourth>fifth:
      temp1=fourth
      fourth=fifth
      fifth=temp1
      temp1=0
      print("swap 4 5")
elif sort=="COCKTAIL":
    while first > second or second > third or third > fourth or fourth > fifth:
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if second > third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
        if third > fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        if fourth > fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            temp1 = 0
            print("swap 4 5")
        if third > fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        if second > third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
elif sort=="ODDEVEN":
    while first > second or second > third or third > fourth or fourth > fifth:
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if third > fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        if second > third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
        if fourth > fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            temp1 = 0
            print("swap 4 5")
elif sort=="INSERTION":
    i=0
    while first > second or second > third or third > fourth or fourth > fifth:
        i+=1
        if i>=4:
            if fourth > fifth:
                temp1 = fourth
                fourth = fifth
                fifth = temp1
                temp1 = 0
                print("swap 4 5")
        if i>=3:
            if third > fourth:
                temp1 = third
                third = fourth
                fourth = temp1
                temp1 = 0
                print("swap 3 4")
        if i>=2:
            if second > third:
                temp1 = second
                second = third
                third = temp1
                temp1 = 0
                print("swap 2 3")
        if i>=1:
            if first > second:
                temp1 = first
                first = second
                second = temp1
                temp1 = 0
                print("swap 1 2")
elif sort=="CYCLE":
    e=0
    while first > second or second > third or third > fourth or fourth > fifth:
        if first!=sor1:
            while e==0:
                if first == sor2:
                    temp1 = first
                    first = second
                    second = temp1
                    temp1 = 0
                    print("swap 1 2")
                elif first == sor3:
                    temp1 = first
                    first = third
                    third = temp1
                    temp1 = 0
                    print("swap 1 3")
                elif first == sor4:
                    temp1 = first
                    first = fourth
                    fourth = temp1
                    temp1 = 0
                    print("swap 1 4")
                elif first == sor5:
                    temp1 = first
                    first = fifth
                    fifth = temp1
                    temp1 = 0
                    print("swap 1 5")
                if first==sor1:
                    e=1
            e=0
        elif second!=sor2:
            while e==0:
                if second==sor3:
                    temp1 = second
                    second = third
                    third = temp1
                    temp1 = 0
                    print("swap 2 3")
                elif second==sor4:
                    temp1 = second
                    second = fourth
                    fourth = temp1
                    temp1 = 0
                    print("swap 2 4")
                elif second==sor5:
                    temp1 = second
                    second = fifth
                    fifth = temp1
                    temp1 = 0
                    print("swap 2 5")
                if second==sor2:
                    e=1
        elif third!=sor3:
            while e==0:
                if third==sor4:
                    temp1 = third
                    third = fourth
                    fourth = temp1
                    temp1 = 0
                    print("swap 3 4")
                elif third==sor5:
                    temp1 = third
                    third = fifth
                    fifth = temp1
                    temp1 = 0
                    print("swap 3 5")
                if third==sor3:
                    e=1
        if fourth>fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            print("swap 4 5")
elif sort=="HEAP":
    if second<fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if second<fifth:
      temp1=second
      second=fifth
      fifth=temp1
      temp1=0
      print("swap 2 5")
    if first<second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if first<third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if second<fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if second<fifth:
      temp1=second
      second=fifth
      fifth=temp1
      temp1=0
      print("swap 2 5")
    if sor5 != fifth:
        temp1 = first
        first = fifth
        fifth = temp1
        temp1 = 0
        print("swap 1 5")
    elif sor4 != fourth:
        temp1 = first
        first = fourth
        fourth = temp1
        temp1 = 0
        print("swap 1 4")
    elif sor3 != third:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        print("swap 1 3")
    elif sor2 != second:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        print("swap 1 2")
    if second<fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if first<second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if first<third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if second<fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if sor4 != fourth:
        temp1 = first
        first = fourth
        fourth = temp1
        temp1 = 0
        print("swap 1 4")
    elif sor3 != third:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        print("swap 1 3")
    elif sor2 != second:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        print("swap 1 2")
    if first<second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if first<third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if sor3 != third:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        print("swap 1 3")
    elif sor2 != second:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        print("swap 1 2")
    if first<second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if sor2 != second:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        print("swap 1 2")
elif sort=="MERGE":
        if first>second:
            temp1=first
            first=second
            second=temp1
            temp1=0
            print("swap 1 2")
        if fourth>fifth:
            temp1=fourth
            fourth=fifth
            fifth=temp1
            temp1=0
            print("swap 4 5")
        if e%2==1:
            if first<second and first<third:
                asdasdasd="as"
            elif second<first and second<third:
                temp1 = first
                first = second
                second = temp1
                temp1 = 0
                print("swap 1 2")
            else:
                temp1 = first
                first = third
                third = temp1
                temp1 = 0
                print("swap 1 3")
            if second > third:
                temp1 = second
                second = third
                third = temp1
                temp1 = 0
                print("swap 2 3")
        else:
            if fifth>fourth and fifth>third:
                esij=12302173128312
            elif fourth>fifth and fourth>third:
                temp1 = fourth
                fourth = fifth
                fifth = temp1
                temp1 = 0
                print("swap 4 5")
            else:
                temp1 = third
                third = fifth
                fifth = temp1
                temp1 = 0
                print("swap 3 5")
            if third > fourth:
                temp1 = third
                third = fourth
                fourth = temp1
                temp1 = 0
                print("swap 3 4")
        if sor1 == first:
            qq8 = 2
        elif sor1 == second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        elif sor1 == third:
            temp1 = first
            first = third
            third = temp1
            temp1 = 0
            print("swap 1 3")
        elif sor1 == fourth:
            temp1 = first
            first = fourth
            fourth = temp1
            temp1 = 0
            print("swap 1 4")
        else:
            temp1 = first
            first = fifth
            fifth = temp1
            temp1 = 0
            print("swap 1 5")
        if sor2 == second:
            eue989we7r79283721312 = 1
        elif sor2 == third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
        elif sor2 == fourth:
            temp1 = second
            second = fourth
            fourth = temp1
            temp1 = 0
            print("swap 2 4")
        else:
            temp1 = second
            second = fifth
            fifth = temp1
            temp1 = 0
            print("swap 2 5")
        if sor3 == third:
            sa = "/rihadastroke"
        elif sor3 == fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        else:
            temp1 = third
            third = fifth
            fifth = temp1
            temp1 = 0
            print("swap 3 5")
        if fourth > fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            temp1 = 0
            print("swap 4 5")
elif sort=="SELECTION":
    if sor1==first:
        qq8=2
    elif sor1==second:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        print("swap 1 2")
    elif sor1==third:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        print("swap 1 3")
    elif sor1==fourth:
        temp1 = first
        first = fourth
        fourth = temp1
        temp1 = 0
        print("swap 1 4")
    else:
        temp1 = first
        first = fifth
        fifth = temp1
        temp1 = 0
        print("swap 1 5")
    if sor2==second:
        eue989we7r79283721312=1
    elif sor2==third:
        temp1 = second
        second = third
        third = temp1
        temp1 = 0
        print("swap 2 3")
    elif sor2==fourth:
        temp1 = second
        second = fourth
        fourth = temp1
        temp1 = 0
        print("swap 2 4")
    else:
        temp1 = second
        second = fifth
        fifth = temp1
        temp1 = 0
        print("swap 2 5")
    if sor3==third:
        sa="/rihadastroke"
    elif sor3==fourth:
        temp1 = third
        third = fourth
        fourth = temp1
        temp1 = 0
        print("swap 3 4")
    else:
        temp1 = third
        third = fifth
        fifth = temp1
        temp1 = 0
        print("swap 3 5")
    if fourth>fifth:
      temp1=fourth
      fourth=fifth
      fifth=temp1
      temp1=0
      print("swap 4 5")
elif sort=="COMB":
    if first>fourth:
      temp1=first
      first=fourth
      fourth=temp1
      temp1=0
      print("swap 1 4")
    if second>fifth:
      temp1=second
      second=fifth
      fifth=temp1
      temp1=0
      print("swap 2 5")
    if first>third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if second>fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if third>fifth:
      temp1=third
      third=fifth
      fifth=temp1
      temp1=0
      print("swap 3 5")
    if first>second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if second>third:
      temp1=second
      second=third
      third=temp1
      temp1=0
      print("swap 2 3")
    if third>fourth:
      temp1=third
      third=fourth
      fourth=temp1
      temp1=0
      print("swap 3 4")
    if fourth>fifth:
      temp1=fourth
      fourth=fifth
      fifth=temp1
      temp1=0
      print("swap 4 5")
elif sort=="QUICK":
    pivot,current=1,5
    while first > second or second > third or third > fourth or fourth > fifth:
        if pivot<current:
            if pivot==1:
                if current==2:
                    if first > second:
                        temp1 = first
                        first = second
                        second = temp1
                        temp1 = 0
                        pivot, current = 2, 1
                        print("swap 1 2")
                elif current==3:
                    if first > third:
                        temp1 = first
                        first = third
                        third = temp1
                        temp1 = 0
                        pivot, current = 3, 1
                        print("swap 1 3")
                elif current==4:
                    if first > fourth:
                        temp1 = first
                        first = fourth
                        fourth = temp1
                        temp1 = 0
                        pivot, current = 4, 1
                        print("swap 1 4")
                elif current==5:
                    if first > fifth:
                        temp1 = first
                        first = fifth
                        fifth = temp1
                        temp1 = 0
                        pivot, current = 5,1
                        print("swap 1 5")
            elif pivot==2:
                if current==3:
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        pivot, current = 3, 2
                        print("swap 2 3")
                elif current==4:
                    if second > fourth:
                        temp1 = second
                        second = fourth
                        fourth = temp1
                        temp1 = 0
                        pivot, current = 4, 2
                        print("swap 2 4")
                elif current==5:
                    if second > fifth:
                        temp1 = second
                        second = fifth
                        fifth = temp1
                        temp1 = 0
                        pivot, current = 5, 2
                        print("swap 2 5")
            elif pivot==3:
                if current==4:
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        pivot, current = 4, 3
                        print("swap 3 4")
                elif current==5:
                    if third > fifth:
                        temp1 = third
                        third = fifth
                        fifth = temp1
                        temp1 = 0
                        pivot, current = 5, 3
                        print("swap 3 5")
            elif pivot==4:
                if fourth > fifth:
                    temp1 = fourth
                    fourth = fifth
                    fifth = temp1
                    temp1 = 0
                    pivot, current = 5, 4
                    print("swap 4 5")
        elif current<pivot:
            if current == 1:
                if pivot == 2:
                    if first > second:
                        temp1 = first
                        first = second
                        second = temp1
                        temp1 = 0
                        current, pivot = 2, 1
                        print("swap 1 2")
                elif pivot == 3:
                    if first > third:
                        temp1 = first
                        first = third
                        third = temp1
                        temp1 = 0
                        current, pivot = 3, 1
                        print("swap 1 3")
                elif pivot == 4:
                    if first > fourth:
                        temp1 = first
                        first = fourth
                        fourth = temp1
                        temp1 = 0
                        current, pivot = 4, 1
                        print("swap 1 4")
                elif pivot == 5:
                    if first > fifth:
                        temp1 = first
                        first = fifth
                        fifth = temp1
                        temp1 = 0
                        current, pivot = 5, 1
                        print("swap 1 5")
            elif current == 2:
                if pivot == 3:
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        current, pivot = 3, 2
                        print("swap 2 3")
                elif pivot == 4:
                    if second > fourth:
                        temp1 = second
                        second = fourth
                        fourth = temp1
                        temp1 = 0
                        current, pivot = 4, 2
                        print("swap 2 4")
                elif pivot == 5:
                    if second > fifth:
                        temp1 = second
                        second = fifth
                        fifth = temp1
                        temp1 = 0
                        current, pivot = 5, 2
                        print("swap 2 5")
            elif current == 3:
                if pivot == 4:
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        current, pivot = 4, 3
                        print("swap 3 4")
                elif pivot == 5:
                    if third > fifth:
                        temp1 = third
                        third = fifth
                        fifth = temp1
                        temp1 = 0
                        current, pivot = 5, 3
                        print("swap 3 5")
            elif current == 4:
                if fourth > fifth:
                    temp1 = fourth
                    fourth = fifth
                    fifth = temp1
                    temp1 = 0
                    current, pivot = 5, 4
                    print("swap 4 5")
        else:
            if sor1==first:
                pivot=1
            elif sor2!=second:
                pivot=2
            elif sor3!=third:
                pivot=3
            elif sor4!=fourth:
                pivot=4
            if sor5!=fifth:
                current=5
            elif sor4!=fourth:
                current=4
            elif sor3!=third:
                current=3
            elif sor2!=second:
                current=2
        if pivot>current:
            current+=1
        else:
            current-=1
elif sort=="BOGO":
    print("Try your best to sort them until it solves\nGood luck")
    print("EEEEEEEEEEEEE")
elif sort=="RADIX":
    if unitsor1==units1:
        isd09fsd0f0suf=2
    elif unitsor1==units2:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        temp2 = units1
        units1 = units2
        units2 = temp2
        temp2 = 0
        print("swap 1 2")
    elif unitsor1==units3:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        temp2 = units1
        units1 = units3
        units3 = temp2
        temp2 = 0
        print("swap 1 3")
    elif unitsor1==units4:
        temp1 = first
        first = fourth
        fourth = temp1
        temp1 = 0
        print("swap 1 4")
        temp2 = units1
        units1 = units4
        units4 = temp2
        temp2 = 0
    else:
        temp1 = first
        first = fifth
        fifth = temp1
        temp1 = 0
        temp2 = units1
        units1 = units5
        units5 = temp2
        temp2 = 0
        print("swap 1 5")
    if unitsor2==units2:
        isfu983=2
    elif unitsor2==units3:
        temp1 = second
        second = third
        third = temp1
        temp1 = 0
        temp2 = units2
        units2 = units3
        units3 = temp2
        temp2 = 0
        print("swap 2 3")
    elif unitsor2==units4:
        temp1 = second
        second = fourth
        fourth = temp1
        temp1 = 0
        temp2 = units2
        units2 = units4
        units4 = temp2
        temp2 = 0
        print("swap 2 4")
    else:
        temp1 = second
        second = fifth
        fifth = temp1
        temp1 = 0
        units2 = units5
        units5 = temp2
        print("swap 2 5")
    if unitsor3==units3:
        elkavojovika078234=1
    elif unitsor3==units4:
        temp1 = third
        third = fourth
        fourth = temp1
        temp1 = 0
        print("swap 3 4")
    else:
        temp1 = third
        third = fifth
        fifth = temp1
        temp1 = 0
        print("swap 3 5")
    if unitsor4==units5:
        temp1 = fourth
        fourth = fifth
        fifth = temp1
        temp1 = 0
        print("swap 4 5")
    if tensor1==tens1:
        isd09fsd0f0suf=2
    elif tensor1==tens2:
        temp1 = first
        first = second
        second = temp1
        temp1 = 0
        temp2 = tens1
        tens1 = tens2
        tens2 = temp2
        temp2 = 0
        print("swap 1 2")
    elif tensor1==tens3:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        temp2 = tens1
        tens1 = tens3
        tens3 = temp2
        temp2 = 0
        print("swap 1 3")
    elif tensor1==tens4:
        temp1 = first
        first = fourth
        fourth = temp1
        temp1 = 0
        print("swap 1 4")
        temp2 = tens1
        tens1 = tens4
        tens4 = temp2
        temp2 = 0
    else:
        temp1 = first
        first = fifth
        fifth = temp1
        temp1 = 0
        temp2 = tens1
        tens1 = tens5
        tens5 = temp2
        temp2 = 0
        print("swap 1 5")
    if tensor2==tens2:
        isfu983=2
    elif tensor2==tens3:
        temp1 = second
        second = third
        third = temp1
        temp1 = 0
        temp2 = tens2
        tens2 = tens3
        tens3 = temp2
        temp2 = 0
        print("swap 2 3")
    elif tensor2==tens4:
        temp1 = second
        second = fourth
        fourth = temp1
        temp1 = 0
        temp2 = tens2
        tens2 = tens4
        tens4 = temp2
        temp2 = 0
        print("swap 2 4")
    else:
        temp1 = second
        second = fifth
        fifth = temp1
        temp1 = 0
        tens2 = tens5
        tens5 = temp2
        print("swap 2 5")
    if tensor3==tens3:
        elkavojovika078234=1
    elif tensor3==tens4:
        temp1 = third
        third = fourth
        fourth = temp1
        temp1 = 0
        print("swap 3 4")
    else:
        temp1 = third
        third = fifth
        fifth = temp1
        temp1 = 0
        print("swap 3 5")
    if tensor4==tens5:
        temp1 = fourth
        fourth = fifth
        fifth = temp1
        temp1 = 0
        print("swap 4 5")
    if first>fourth:
      temp1=first
      first=fourth
      fourth=temp1
      temp1=0
      print("swap 1 4")
    if second>fifth:
      temp1=second
      second=fifth
      fifth=temp1
      temp1=0
      print("swap 2 5")
    if first>third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if second>fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if third>fifth:
      temp1=third
      third=fifth
      fifth=temp1
      temp1=0
      print("swap 3 5")
    if first>second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if second>third:
      temp1=second
      second=third
      third=temp1
      temp1=0
      print("swap 2 3")
    if third>fourth:
      temp1=third
      third=fourth
      fourth=temp1
      temp1=0
      print("swap 3 4")
    if fourth>fifth:
      temp1=fourth
      fourth=fifth
      fifth=temp1
      temp1=0
      print("swap 4 5")
elif sort=="FIVE":
    if sor3==first:
        temp1 = first
        first = third
        third = temp1
        temp1 = 0
        print("swap 1 3")
    if sor3==second:
        temp1 = second
        second = third
        third = temp1
        temp1 = 0
        print("swap 2 3")
    if sor3==fourth:
        temp1 = third
        third = fourth
        fourth = temp1
        temp1 = 0
        print("swap 3 4")
    if sor3==fifth:
        temp1 = third
        third = fifth
        fifth = temp1
        temp1 = 0
        print("swap 3 5")
    if first>sor3:
        if fourth<first and fourth<third:
            temp1 = first
            first = fourth
            fourth = temp1
            temp1 = 0
            print("swap 1 4")
        elif fifth<first and fifth<third:
            temp1 = first
            first = fifth
            fifth = temp1
            temp1 = 0
            print("swap 1 5")
    if second>sor3:
        if fourth<second and fourth<third:
            temp1 = second
            second = fourth
            fourth = temp1
            temp1 = 0
            print("swap 2 4")
        elif fifth<second and fifth<third:
            temp1 = second
            second = fifth
            fifth = temp1
            temp1 = 0
            print("swap 2 5")
    if first>second:
      temp1=first
      first=second
      second=temp1
      temp1=0
      print("swap 1 2")
    if fourth > fifth:
        temp1 = fourth
        fourth = fifth
        fifth = temp1
        temp1 = 0
        print("swap 4 5")
elif sort=="STOOGE":
    for i in range(3):
        if i%2==0:
            for ia in range(3):
                if ia==1:
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        print("swap 2 3")
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        print("swap 3 4")
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        print("swap 2 3")
                else:
                    if first > second:
                        temp1 = first
                        first = second
                        second = temp1
                        temp1 = 0
                        print("swap 1 2")
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        print("swap 2 3")
                    if first > second:
                        temp1 = first
                        first = second
                        second = temp1
                        temp1 = 0
                        print("swap 1 2")
        else:
            for ib in range(3):
                if ib == 1:
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        print("swap 3 4")
                    if fourth > fifth:
                        temp1 = fourth
                        fourth = fifth
                        fifth = temp1
                        temp1 = 0
                        print("swap 4 5")
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        print("swap 3 4")
                else:
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        print("swap 2 3")
                    if third > fourth:
                        temp1 = third
                        third = fourth
                        fourth = temp1
                        temp1 = 0
                        print("swap 3 4")
                    if second > third:
                        temp1 = second
                        second = third
                        third = temp1
                        temp1 = 0
                        print("swap 2 3")
elif sort=="SLOW":
    while first > second or second > third or third > fourth or fourth > fifth:
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if second > third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if fourth > fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            temp1 = 0
            print("swap 4 5")
        if third > fifth:
            temp1 = third
            third = fifth
            fifth = temp1
            temp1 = 0
            print("swap 3 5")
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if third > fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        if second > fourth:
            temp1 = second
            second = fourth
            fourth = temp1
            temp1 = 0
            print("swap 2 4")
    print("Placeholder")
elif sort=="SHELL":
    if first>third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    if second>fourth:
      temp1=second
      second=fourth
      fourth=temp1
      temp1=0
      print("swap 2 4")
    if third>fifth:
      temp1=third
      third=fifth
      fifth=temp1
      temp1=0
      print("swap 3 5")
    if first>third:
      temp1=first
      first=third
      third=temp1
      temp1=0
      print("swap 1 3")
    while first > second or second > third or third > fourth or fourth > fifth:
        if first > second:
            temp1 = first
            first = second
            second = temp1
            temp1 = 0
            print("swap 1 2")
        if second > third:
            temp1 = second
            second = third
            third = temp1
            temp1 = 0
            print("swap 2 3")
        if third > fourth:
            temp1 = third
            third = fourth
            fourth = temp1
            temp1 = 0
            print("swap 3 4")
        if fourth > fifth:
            temp1 = fourth
            fourth = fifth
            fifth = temp1
            temp1 = 0
            print("swap 4 5")
print("-------------------------------------")
if sort!="BOGO":
    print(first,second,third,fourth,fifth)
print("done ye")