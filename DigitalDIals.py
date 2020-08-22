serial=input("What is the serial number (please use normal ruleset)?\n")
dismain=int(input("What is the main display's number (all 3)\n"))
stepa1a,stepa2a,stepa3a=int(str(dismain).zfill(3)[0]),int(str(dismain).zfill(3)[1]),int(str(dismain).zfill(3)[2])
ser1,ser2,ser3,ser4,ser5,ser6=str(serial)[0],str(serial)[1],int(str(serial)[2]),str(serial)[3],str(serial)[4],int(str(serial)[5])
stepa1b=stepa2b=stepa3b=stepb1a=stepb2a=stepb3a=stepb1b=stepb2b=stepb3b=add1=add2=add3=0
if ser1=="3" or ser1=="4" or ser1=="5" or ser1=="6" or ser1=="7" or ser1=="8" or ser1=="9" or ser1=="0" or ser1=="1" or ser1=="2":
    if ser2=="3" or ser2=="4" or ser2=="5" or ser2=="6" or ser2=="7" or ser2=="8" or ser2=="9" or ser2=="0" or ser2=="1" or ser2=="2":
        stepa1b,stepa2b,stepa3b=stepa1a+int(ser1),stepa2a+int(ser2),stepa3a+int(ser3)
    else:
        stepa1b,stepa2b,stepa3b=stepa1a+int(ser1),stepa2a+int(ser3),stepa3a+int(ser6)
elif ser2=="3" or ser2=="4" or ser2=="5" or ser2=="6" or ser2=="7" or ser2=="8" or ser2=="9" or ser2=="0" or ser2=="1" or ser2=="2":
    stepa1b,stepa2b,stepa3b=stepa1a+int(ser2),stepa2a+int(ser3),stepa3a+int(ser6)
else:
    stepa1b,stepa2b,stepa3b=stepa1a+int(ser3),stepa2a+int(ser6),stepa3a+int(input("Amt of Ports?"))
steparesult=(stepa1b*stepa2b*stepa3b) % 1000
stepb1a,stepb2a,stepb3a=int(str(steparesult).zfill(3)[0]),int(str(steparesult).zfill(3)[1]),int(str(steparesult).zfill(3)[2])
print("Set dials to:",stepb1a,stepb2a,stepb3a)
stepb1b,stepb2b,stepb3b=int(input("\nFirst display (No leading 0s this time)\n")),int(input("Second display\n")),int(input("Third display\n"))
table1,table2,table3="6709384125029187643581573294602048956317815072396441583762093794508261821754693092538674015627938041","2853961740456107298330671482951860453927507429183698015764233982467051531980276435129407869106835472","9825401763752061849353178406290872953164216903487585043612797018256439461728935025467019831253894067"
stepb1c,stepb2c,stepb3c=(stepb1a+int(table1[stepb1b]))%10,(stepb2a+int(table2[stepb2b]))%10,(stepb3a+int(table3[stepb3b]))%10
print("\nSet dials to:",stepb1c,stepb2c,stepb3c)
stepc1,stepc2,stepc3=int(input("\nFirst display again (No leading 0s)\n")),int(input("Second display\n")),int(input("Third display\n"))
stepd=stepc1*stepc2*stepc3
while stepd>=10:
    temp1,temp2,temp3,temp4,temp5,temp6=int(str(stepd).zfill(6)[0]),int(str(stepd).zfill(6)[1]),int(str(stepd).zfill(6)[2]),int(str(stepd).zfill(6)[3]),int(str(stepd).zfill(6)[4]),int(str(stepd).zfill(6)[5])
    stepd=temp1+temp2+temp3+temp4+temp5+temp6
print("Submit at",stepd)