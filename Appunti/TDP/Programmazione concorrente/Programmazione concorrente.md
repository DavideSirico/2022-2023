Motivazioni
- Fino ad ora si è utilizzato il paradigma di programmazione **sequenziale**
- ogni programma ha un **singolo** flusso di esecuzione
- una solo funzione alla volta
- anche i problemi complessi hanno un solo flusso

Al termine di ogni istruzione l'esecutore passa l'istruzione successiva (ordine sequenziale)
1 istruzione alla volta



Applicazioni complesse
l'input esterno non blocca il programma
fruttare i thread e i core della cpu



Programmazione parallela:
- processi
- thread

### Processi
I processi hanno:
- PID
- Priorità
- User
- HW usage
- Stato (ready, run, wait)
- Stato (ultima esecuzione eseguita)
- PCB

### Thread
Il thread è un processo leggero.
Il thread è una parte di un processo che condivide con esso:
- il PID
- Priorità
- User
Può eseguire istruzioni (flusso di esecuzione)
Condivide le risorse (informazioni)
Può utilizzare le risorse hardware ulteriori che il processore possiede.