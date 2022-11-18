;ese.asm
; Descrizione del programma
; Costanti
STARTPGM = 0xee00
STARTDATI = 0x80
RESETVECT = 0xfffe
; Variabili
.area DATA (ABS)
.org STARTDATI
num1: .blkb 1
num2: .blkb 1
num3: .blkb 1
primo: .blkb 1
secondo: .blkb 1
terzo: .blkb 1
.area PROGRAMMA (ABS)
.org STARTPGM
MAIN: 
MOV #3, num1
MOV #2, num2
MOV #1, num3
LDA num1
CMP num2
BLT IF1
LDA num2
CMP num3
BLT IF5
LDA num3
STA primo
LDA num1
CMP num2
BLT IF4
LDA num2
STA secondo
LDA num1
STA terzo
IF1:
CMP num3
BLT IF2
LDA num3
STA primo
LDA num1
CMP num2
BLT IF4
LDA num2
STA secondo
LDA num1
STA terzo
BRA FINE
IF2:
STA primo
LDA num2
CMP num3
BLT IF3
LDA num3
STA secondo
LDA num2
STA terzo
BRA FINE
IF3:
LDA num2
STA secondo
LDA num3
STA terzo
BRA FINE
IF4:
LDA num1
STA secondo
LDA num2
STA terzo
BRA FINE
IF5:
LDA num2
STA primo
LDA num1
CMP num3
BLT IF6
LDA num1
STA terzo
LDA num3
STA secondo
BRA FINE
IF6:
LDA num1
STA secondo
LDA num3
STA terzo
BRA FINE
FINE : BRA FINE
.area RESET (ABS)
.org RESETVECT
.word MAIN
