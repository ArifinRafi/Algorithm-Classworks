package lab05;
import java.io.File;
import java.util.*;
public class task2 {
	public static void sort(Task[] tasks, int N)

	{
	for (int i = 0; i < N; i++)

	{

	for (int j = 0; j < N - 1; j++)

	{
	if (tasks[j].finish > tasks[j + 1].finish)

	{

	Task temp = new Task(tasks[j].start, tasks[j].finish);
	tasks[j] = tasks[j + 1];
	tasks[j + 1] = temp;
	}
	}
	}
	}

	public static int maxTaskCompletion(Task[] tasks, int N, int M)

	{

	boolean taskDone[] = new boolean[N];

	int totalTasks = 0; // stores the total task

	for (int i = 0; i < M; i++)

	{
	int currentFinish = -1;
	for (int j = 0; j < N; j++)

	{
	if (!taskDone[j])

	{

	if (tasks[j].start >= currentFinish)

	{
	currentFinish = tasks[j].finish;
	taskDone[j] = true;
	totalTasks++;
	}
	}
	}
	}

	return totalTasks;
	}

	public static void main(String[] args)

	{
		try {
			File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/input02.txt");
			Scanner in = new Scanner(file);

	
	int N = in.nextInt(), M = in.nextInt();
	Task tasks[] = new Task[N]; // N tasks

	for (int i = 0; i < N; i++)

	{
	int s = in.nextInt(), f = in.nextInt();
	tasks[i] = new Task(s, f);
	}
	sort(tasks, N);
	Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/lab05/output02.txt");
	int n = maxTaskCompletion(tasks, N, M);	 
	formatter.format("%s \n", n);
	formatter.close();
	
	}
		catch(Exception e) {
			
		}
	}
	


  static class Task

	{
	public int start, finish;
	public Task(int _start, int _finish)

	{
	start = _start;
	finish = _finish;
	}
	}
}
	


