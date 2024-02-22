package Test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Impl.FoodDaoImpl;
import POJO.Food;

public class FoodTest {

	public static void main(String[] args) {
		FoodDaoImpl fdao = new FoodDaoImpl();
		Food f = new Food();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1.Add Food: ");
		System.out.println("2.Delete Food: ");
		System.out.println("3.Update Food: ");
		System.out.println("4. List Of Food: ");
		System.out.println("5.Search By Food Id: ");
		System.out.println("6.Search By Food Name: ");
		System.out.println("7.Search By Food Category: ");
		System.out.println("8.Search By Image: ");
		int Choice = sc.nextInt();
		sc.nextLine();
		switch (Choice) {
		case 1:
			System.out.println("Enter food name: ");
			String foodName = sc.nextLine();

			System.out.println("Enter food type: ");
			String foodType = sc.nextLine();

			System.out.println("Enter food category: ");
			String foodCategory = sc.nextLine();

			System.out.println("Enter food description: ");
			String foodDesc = sc.nextLine();

			System.out.println("Enter food price: ");
			double foodPrice = sc.nextDouble();

			System.out.println("Enter food image: ");
			String image = sc.nextLine();

			Food f1 = new Food(foodName, foodType, foodCategory, foodDesc, foodPrice, image);
			boolean b = fdao.addFood(f1);

			String a = (b) ? "Data added successfully" : "Error";
			System.out.println(a);

//			if (b) {
//				System.out.println("Data added successfully");
//			} else {
//				System.out.println("Error");
//			}

			break;

		case 2:
			System.out.println("Enter FoodID you want to delete: ");
			int foodId = sc.nextInt();
			boolean b1 = fdao.deleteFood(foodId);
			String a1 = (b1) ? "Data Deleted successfully" : "Error";
			System.out.println(a1);

			break;

		case 3:
			System.out.println("Enter Existing food Id for update : ");
			int fid = sc.nextInt();

			System.out.println("Enter food name: ");
			String fName = sc.next();

			System.out.println("Enter food type: ");
			String fType = sc.next();

			System.out.println("Enter food category: ");
			String fCategory = sc.next();

			System.out.println("Enter food description: ");
			String fDesc = sc.next();

			System.out.println("Enter food price: ");
			double fPrice = sc.nextDouble();

			System.out.println("Enter food image: ");
			String fimage = sc.nextLine();

			f.setFoodId(fid);
			f.setFoodName(fName);
			f.setFoodType(fType);
			f.setFoodCategory(fCategory);
			f.setFoodDesc(fDesc);
			f.setFoodPrice(fPrice);
			f.setImage(fimage);

			boolean b2 = fdao.updateFood(f);
			String a2 = (b2) ? "Data Updated successfully" : "Error";
			System.out.println(a2);

			break;

		case 4:
			List<Food> l = fdao.getAllFood();
			if (l != null) {
				Iterator<Food> it = l.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
			}

			break;

		case 5:
			System.out.println("Enter Existing Food ID");
			int id = sc.nextInt();
			Food f3 = fdao.searchFood(id);
			if (f3 != null) {
				System.out.println(f3);
			} else {
				System.err.println("Food is not available");
			}

			break;

		case 6:
			System.out.println("Enter Food Name: ");
			String name = sc.next();
			List<Food> l1 = fdao.serachFoodByName(name);
			if (l1 != null) {
				Iterator<Food> it = l1.iterator();
				System.out.println(it);
//				while (it.hasNext()) {
//					System.out.println(it.next());
//				}
			} else {
				System.err.println("Unsuccessful");
			}

			break;

		case 7:
			System.out.println("Enter Food Category: ");
			String foodtype = sc.next();
			List<Food> l2 = fdao.searchFoodByCategory(foodtype);
			if (l2 != null) {
				Iterator<Food> it = l2.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
			}

			break;

		default:
			System.err.println("please select proper Options!!!!!!");
			break;
		}
		sc.close();
	}

}
