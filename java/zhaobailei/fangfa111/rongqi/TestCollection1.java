package rongqi;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add(new Name("s1", "l1"));
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);

	}

	class Name {
		private String firstName, lastName;

		public Name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastNAme() {
			return lastName;
		}

		public String toString() {
			return firstName + " " + lastName;
		}

		public boolean equals(Object obj) {
			if (obj instanceof Name) {
				Name name = (Name) obj;
				return (firstName.equals(name.firstName))
						&& (lastName.equals(name.lastName));

			}
			Object suprt = null;
			return suprt.equals(obj);
		}

		public int hashCode() {
			return firstName.hashCode();
		}

	}

}
// int size ���� ���ٸ�Ԫ��
// boolean isEmpty�����ǲ��ǿյ�
// void clear( )���
// boolean contains (object element)�ǲ��ǰ���ĳһ������
// boolean add (object element)���ĳ��Ԫ��
// boolean remove (Object element)ɾ��
// Iterator iterator ( )
// boolean containsAll (Collectin c)�ǲ��ǰ������е�Ԫ��
// boolean addAll (Collection c)
// boolean removeAll(Collection c)
// boolean retainAll (Collection C������
// Object[] toArray( )
