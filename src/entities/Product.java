package entities;
/*
Essa classe foi moldada com o intuito de receber e tratar os dados dos produtos vindos do banco
de dados, ou seja, ela vai ser instanciada quando o Postgres me retornar um produto que foi pedido
pelo cliente. O objetivo é receber essas informações e tratar elas da melhor maneira possível
 */
public class Product {

	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", imageUri=" + imageUri + "]";
	}

}
