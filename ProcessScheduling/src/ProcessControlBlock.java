
public class ProcessControlBlock {
	private int pid;
	private int arrivalTime;
	private int burstTime;
	private int remainingBurstTime;
	private int waitTime;
	private int completionTime;
	private int turnAroundTime;
	private int priority;
	private ProcessStateEnum processState; //NEW, READY, RUNNING, TERMINATED
	private int programCounter;	
	
	public ProcessControlBlock(int pid, ProcessStateEnum processState, int programCounter) {
		this.pid = pid;		
		this.processState = processState;
		this.programCounter = programCounter;
	}
	
	public int getPID() { //get process id of the process
		return pid; 
	}
	
	public int getArrivalTime() { //get arrival time of the process
		return arrivalTime; 
	}
	
	public void setArrivalTime(int arrivalTime) { //set arrival time of the process
		this.arrivalTime = arrivalTime; 
	}
	
	public int getBurstTime() { //get burst time of the process
		return burstTime; 
	}
	
	public void setBurstTime(int burstTime) { //set burst time of the process
		this.burstTime = burstTime;
	}
	
	public int getRemainingBurstTime() { //get remaining burst time of the process
		return remainingBurstTime;
	}
	
	public void setRemainingBurstTime(int remainingBurstTime) { //set remaining burst time of the process
		this.remainingBurstTime = remainingBurstTime;
	}
		
	public int getWaitTime() { //get wait time of the process
		return waitTime; 
	}
	
	public void setWaitTime(int waitTime) { //set wait time of the process
		this.waitTime = waitTime; 
	}
	
	public int getCompletionTime() { //get completion time of the process
		return completionTime; 
	}
	
	public void setCompletionTime(int completionTime) { //set completion time of the process
		this.completionTime = completionTime;
	}
	
	public int getTurnAroundTime() { //get turn around time of the process
		return turnAroundTime; 
	}
	
	public void setTurnAroundTime(int turnAroundTime) { //set turn around time of the process
		this.turnAroundTime = turnAroundTime; 
	}
	
	public int getPriority() { //get priority of the process
		return priority; 
	}
	
	public void setPriority(int priority) { //set priority of the process
		this.priority = priority; 
	}
	
	public ProcessStateEnum getProcessState() { //get state of the process
		return processState;
	}
	
	public void setProcessState(ProcessStateEnum processState) { //set state of the process
		this.processState = processState;
	}
	
	public int getProgramCounter() { //get program counter of the process
		return programCounter;
	}
	
	public void setProgramCounter(int programCounter) { //set program counter of the process
		this.programCounter = programCounter;
	}
}
