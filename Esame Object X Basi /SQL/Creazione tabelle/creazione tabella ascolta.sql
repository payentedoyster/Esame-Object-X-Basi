{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 create table ascolta (\
	\
	cod_utente varchar(20) not null,\
	cod_traccia number not null,\
\
	constraint fk_ascolta_utente foreign key (cod_utente) references utente(identify),\
	constraint fk_ascolta_traccia foreign key (cod_traccia) references traccia(codice)\
)}