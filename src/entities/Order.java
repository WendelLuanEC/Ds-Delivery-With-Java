package entities;
/*
Essa classe foi moldada com o intuito de receber e tratar os dados dos pedidos vindos do banco
de dados, ou seja, ela vai ser instanciada quando o Postgres me retornar um pedido.
O objetivo é receber essa informação e poder trata-la internamente.
 */
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long id;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;

	private List<Product> products = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", moment=" + moment
				+ ", status=" + status + "]";
	}
	
	

}
