# -*- coding:utf-8 -*-
import sys
import os

basedir = os.path.abspath(os.path.dirname(__file__))
def gen_layout():
    rootdir = os.path.join(basedir,'res','layout')
    lst_names = ['one','two','three','four','five','six','seven','eight','nine','ten']
    srcfile = os.path.join(rootdir,'activity_second.xml')
    f = open(srcfile,'r')
    lines = f.readlines()
    f.close()
    for i in range(0,10):
        dstfile = os.path.join(rootdir,'activity_%s.xml' % lst_names[i])
        f = open(dstfile,'w')
        for line in lines:
            if line.find('two')!=-1 and lst_names[i]!='two':
                line = line.replace('two',lst_names[i])
            f.write(line)
        f.close()
        
def gen_activiy():
    rootdir = os.path.join(basedir,'src/com/tencent/tmgp/speedmobile')
    lst_names = ['one','two','three','four','five','six','seven','eight','nine','ten']
    lst_names2 = ['One','Two','Three','Four','Five','Six','Seven','Eight','Nine','Ten']
    srcfile = os.path.join(rootdir,'SecondActivity.java')
    f = open(srcfile,'r')
    lines = f.readlines()
    f.close()
    for i in range(2,9):
        dstfile = os.path.join(rootdir,'%sActivity.java' % lst_names2[i])
        f = open(dstfile,'w')
        for line in lines:
            if line.find('Second')!=-1:
                line = line.replace('Second',lst_names2[i])
            elif line.find('Three')!=-1:
                line = line.replace('Three',lst_names2[i+1])
            elif line.find('second')!=-1:
                line = line.replace('second',lst_names[i])
                
            f.write(line)
        f.close()
        
def gen_strings():
    lst_names = ['one','two','three','four','five','six','seven','eight','nine','ten']
    lst_names2 = ['One','Two','Three','Four','Five','Six','Seven','Eight','Nine','Ten']
    template = "<string name=\"title_activity_ten\">TenActivity</string>"
    #template = "<activity android:name=\"com.tencent.tmgp.speedmobile.TenActivity\" android:label=\"@string/title_activity_ten\" ></activity>"
    for i in range(0,9):
        x = template.replace('ten',lst_names[i])
        x = x.replace('Ten',lst_names2[i])
        print(x)
if __name__ == '__main__':
    print('gen source code...')
    #gen_activiy()
    #gen_layout()
    gen_strings()