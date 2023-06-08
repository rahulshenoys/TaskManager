package com.uttara.TaskManager;

import java.util.Comparator;

public class TaskNameCamparator implements Comparator<TaskBean>
{
	

	@Override
	public int compare(TaskBean o1, TaskBean o2) 
	{
		return o1.getTaskName().compareToIgnoreCase(o2.getTaskName());
		
	}
}

class TaskDateCompartor implements Comparator<TaskBean>
{

	@Override
	public int compare(TaskBean o1, TaskBean o2) 
	{
		return o1.getPlannedDate().compareTo(o2.getPlannedDate());
	}
	
}

class TaskPriorityComparator implements Comparator<TaskBean>
{

	@Override
	public int compare(TaskBean o1, TaskBean o2) 
	{
		if(o1.getPriority()>o2.getPriority())
			return 1;
		else if(o1.getPriority()>o2.getPriority())
			return -1;
		
		return 0;
	}
	
}