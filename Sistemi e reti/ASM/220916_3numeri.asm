;ese.asm
; Descrizione del programma
; Costanti
STARTPGM = 0xee00
STARTDATI = 0x80
RESETVECT = 0xfffe
; Variabili
.area DATA (ABS)
.org STARTDATI
aa: .blkb 1
bb: .blkb 1
cc: .blkb 1
primo: .blkb 1
secondo: .blkb 1
terzo: .blkb 1
.area PROGRAMMA (ABS)
.org STARTPG
MAIN:
MOV #6, aa
MOV #9, bb	
MOV #69,cc
LDA aa
SE: CMP bb
BGT: Ab
LDA bb
BGT Bc2
LDA cc
STA primo
LDA bb
CMP aa  
BGT Ba2
LDA aa 
STA secondo 
LDA bb  
STA terzo
Ab: 
CMP cc
BGT: Ac	
LDA cc
STA primo
LDA bb
BGT: Ba
LDA aa
STA secondo
LDA bb
STA terzo
BRA FINE
Ac: 
        STA primo
        LDA bb
        CMP cc
        BGT Bc
        STA terzo
        LDA cc
        STA secondo
        BRA FINE
    Bc: 
        STA secondo
        LDA cc
        STA terzo
    Ba: 
        STA secondo
        LDA aa
        STA terzo
    Bc2:
        STA primo
        LDA aa
        CMP cc
        BGT Ac2
        STA terzo
        LDA cc
        STA secondo
        BRA FINE
    Ac2:
        STA secondo
        LDA cc
        STA terzo
        BRA FINE
    Ba2:
        STA secondo
        LDA aa
        STA terzo
        BRA FINE
;
FINE:	BRA FINE				; Loop infinito per fermare il programma
;
.area   RESET (ABS)
.org    RESETVECT			;inizio area RESET (il nome RESET è scelto liberamente)
.word   MAIN				; alloca 2 byte con valore MAIN (locazione iniziale del prg)
