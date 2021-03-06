
package af.gov.anar.hooks.hook.data;

@SuppressWarnings("unused")
public class Field {

	private final String fieldName;
	private final String fieldValue;
	private final String fieldType;
	private final Boolean optional;
	private final String placeholder;

	public static Field fromConfig(final String fieldName,
			final String fieldValue) {
		return new Field(null, fieldName, fieldValue, null, null);
	}

	public static Field fromSchema(final String fieldType,
			final String fieldName, final Boolean optional,
			final String placeholder) {
		return new Field(fieldType, fieldName, null, optional, placeholder);
	}

	private Field(final String fieldType, final String fieldName,
			final String fieldValue, final Boolean optional,
			final String placeholder) {
		this.fieldType = fieldType;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.optional = optional;
		this.placeholder = placeholder;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public String getFieldType() {
		return this.fieldType;
	}

}
