package orderingmeals;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Burger implements Item, List<Item>
{
	private String name;
	private float price;
	private Packing packing;
	
	
	public Burger(String name, float price, Packing packing)
	{
		super();
		this.name = name;
		this.price = price;
		this.packing = packing;
	}
	
	

	public String getName() 
	{
		return name;
	}



	public void setName(String name) 
	{
		this.name = name;
	}



	public float getPrice()
	{
		return price;
	}



	public void setPrice(float price)
	{
		this.price = price;
	}



	public Packing getPacking() 
	{
		return packing;
	}



	public void setPacking(Packing packing)
	{
		this.packing = packing;
	}



	@Override
	public String name()
	{
		return name;
	}
	
	@Override
	public Packing packing()
	{
		return new Wrapping();
	}
	
	@Override
	public float price()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + price;
	}



	@Override
	public boolean add(Item e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void add(int index, Item element) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean addAll(Collection<? extends Item> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean addAll(int index, Collection<? extends Item> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Item get(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ListIterator<Item> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ListIterator<Item> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Item remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Item set(int index, Item element) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<Item> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
}
