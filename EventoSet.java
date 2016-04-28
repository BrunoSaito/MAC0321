
public class EventoSet {
	private Evento[] events = new Evento[1000000];
	private int index = 0;
	private int next = 0;
	public void add(Evento e) {
		events[index++] = e;
	}
	public Evento getNext() {
		int n = 0;
		n = next;
		next++;
		return events[n];
	}
	public Evento viewNext() {
		return events[next];
	}
	public void removeCurrent() {
		events[next-1] = null;
	}
	public void destroyEventoByDaniel() {
		next++;
		removeCurrent();
	}
}
