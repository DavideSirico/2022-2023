;ese.asm
; Descrizione del programma
; Costanti
STARTPGM = 0xee00
STARTDATI = 0x80
RESETVECT = 0xfffe
; Variabili
.area DATA (ABS)
.org STARTDATI
i: .blkb 1
media: .blkb 1
somma: .blkb 1
.area PROGRAMMA (ABS)
.org STARTPGM
MAIN:
MOV #0, i
MOV #0, somma
MOV #0, media
LDA i

FOR:
CMP #10
BGE FINEFOR
LDA somma
ADD i
STA somma
INC i
LDA i
BRA FOR


FINEFOR:
LDA somma
LOOP:
CMP #10
BLT FINE
SUB #10
STA somma
INC media
BRA LOOP


FINE : BRA FINE
.area RESET (ABS)
.org RESETVECT
.word MAIN
