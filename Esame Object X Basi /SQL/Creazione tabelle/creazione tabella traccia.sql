{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 create table traccia(\
    \
    codice number not null,\
    nome VARCHAR(50) not null,\
    anno date,\
    n_ascolti number ,\
    fascia_oraria varchar(15),\
    tipo varchar(20),\
    genere varchar(20),\
    cod_artista varchar(20) not null,\
    cod_album number not null,\
    \
    constraint pk_traccia primary key (codice),\
    constraint fk_traccia_utente foreign key (cod_artista) references artista (nome),\
    constraint fk_traccia_album foreign key (cod_album) references album(codice) \
)\
\
create sequence pk_traccia minvalue 1 start with 1 cache 1000;}