{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 create table appartiene(\
    \
    cod_traccia number not null,\
    cod_artista varchar(20) not null,\
    \
     constraint fk_appartiene_artista foreign key (cod_artista) references artista (nome),\
     constraint fk_appartiene_traccia foreign key (cod_traccia) references traccia (codice)\
)}