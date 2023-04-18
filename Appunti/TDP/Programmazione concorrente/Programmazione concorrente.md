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

Si può estendere la classe Thread e fare l'override del metodo run.
Ma se si estende la classe non si può ereditare un'altra classe.

SI può usare l'interface Runnable e implementare il metodo run();




## Ciclo di vita del thread

1. New Thread -> creazione di un nuovo thread tramite il costruttore (condivisione della memoria)
2. Runnable -> pronto ad essere eseguito ma non ancora in esecuzione
3. Running -> con `yield()` possiamo lasciare il posto ad un altro thread; da running possiamo andare in dead cioè termina l'esecuzione
4. Non runnable 
	1. `sleep(x)` -> interrompe l'esecuzione di ogni istruzione per x millisecondi. (Esegue istruzioni vuote -> non lascia il posto ad un altro) -> STATIC
	2. `suspend()` -> blocca l'esecuzione (non puoi ucciderlo ma ti serve bloccato) -> per far ripartire il thread `resume()` nel Main
	3. `wait()` -> HW, contatore, file condivisi con altri processi o thread mette in attesa fino a quando non viene richiamato dal metodo `notify()` (il file si libera, il contatore viene rilasciato, l'HW è libero, etc.) -> STATIC della classe Object
5. Dead -> durante ogni momento si può passare a questo stato. Non usare il metodo `stop()` ma usare il metodo `interrupt()`


## Time Slice Round Robin
Ad ogni thread viene assegnato un tempo e dopo quel tempo il thread viene messo in pausa e ne viene eseguito un altro.

## Thread a livello utente e livello Kernel
I processi sono a livello kernel, i thread possono essere a livello SO o kernel.

A livello Kernel:
- gestiti dal S.O e riconosciuti da esso -> usando lo scheduler del S.O;
- di più complessa implementazione software;
- più lenti;
- dipendenti dal S.O. stesso;
- Usando il S.O possono accedere al kernel del ~~~~~
- Più efficenti
Creare driver
basso livello


Thread a livello utente - ciclo di vita(2)
[qui](obsidian://open?vault=Appunti&file=TDP%2FProgrammazione%20concorrente%2FFlusso.canvas)