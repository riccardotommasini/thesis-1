package phisco.streams.polimi.it.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Literal extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9208357292924357721L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Literal\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"long\",\"float\"]},{\"name\":\"datatype\",\"type\":[\"null\",\"string\"]},{\"name\":\"lang\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"LiteralKind\",\"symbols\":[\"literal\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Literal> ENCODER =
      new BinaryMessageEncoder<Literal>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Literal> DECODER =
      new BinaryMessageDecoder<Literal>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Literal> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Literal> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Literal>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Literal to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Literal from a ByteBuffer. */
  public static Literal fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Object value;
  @Deprecated public java.lang.CharSequence datatype;
  @Deprecated public java.lang.CharSequence lang;
  @Deprecated public LiteralKind type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Literal() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param datatype The new value for datatype
   * @param lang The new value for lang
   * @param type The new value for type
   */
  public Literal(java.lang.Object value, java.lang.CharSequence datatype, java.lang.CharSequence lang, LiteralKind type) {
    this.value = value;
    this.datatype = datatype;
    this.lang = lang;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return datatype;
    case 2: return lang;
    case 3: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Object)value$; break;
    case 1: datatype = (java.lang.CharSequence)value$; break;
    case 2: lang = (java.lang.CharSequence)value$; break;
    case 3: type = (LiteralKind)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Object value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'datatype' field.
   * @return The value of the 'datatype' field.
   */
  public java.lang.CharSequence getDatatype() {
    return datatype;
  }

  /**
   * Sets the value of the 'datatype' field.
   * @param value the value to set.
   */
  public void setDatatype(java.lang.CharSequence value) {
    this.datatype = value;
  }

  /**
   * Gets the value of the 'lang' field.
   * @return The value of the 'lang' field.
   */
  public java.lang.CharSequence getLang() {
    return lang;
  }

  /**
   * Sets the value of the 'lang' field.
   * @param value the value to set.
   */
  public void setLang(java.lang.CharSequence value) {
    this.lang = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public LiteralKind getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(LiteralKind value) {
    this.type = value;
  }

  /**
   * Creates a new Literal RecordBuilder.
   * @return A new Literal RecordBuilder
   */
  public static Literal.Builder newBuilder() {
    return new Literal.Builder();
  }

  /**
   * Creates a new Literal RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Literal RecordBuilder
   */
  public static Literal.Builder newBuilder(Literal.Builder other) {
    return new Literal.Builder(other);
  }

  /**
   * Creates a new Literal RecordBuilder by copying an existing Literal instance.
   * @param other The existing instance to copy.
   * @return A new Literal RecordBuilder
   */
  public static Literal.Builder newBuilder(Literal other) {
    return new Literal.Builder(other);
  }

  /**
   * RecordBuilder for Literal instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Literal>
    implements org.apache.avro.data.RecordBuilder<Literal> {

    private java.lang.Object value;
    private java.lang.CharSequence datatype;
    private java.lang.CharSequence lang;
    private LiteralKind type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Literal.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datatype)) {
        this.datatype = data().deepCopy(fields()[1].schema(), other.datatype);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lang)) {
        this.lang = data().deepCopy(fields()[2].schema(), other.lang);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Literal instance
     * @param other The existing instance to copy.
     */
    private Builder(Literal other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datatype)) {
        this.datatype = data().deepCopy(fields()[1].schema(), other.datatype);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lang)) {
        this.lang = data().deepCopy(fields()[2].schema(), other.lang);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Object getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public Literal.Builder setValue(java.lang.Object value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public Literal.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'datatype' field.
      * @return The value.
      */
    public java.lang.CharSequence getDatatype() {
      return datatype;
    }

    /**
      * Sets the value of the 'datatype' field.
      * @param value The value of 'datatype'.
      * @return This builder.
      */
    public Literal.Builder setDatatype(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.datatype = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'datatype' field has been set.
      * @return True if the 'datatype' field has been set, false otherwise.
      */
    public boolean hasDatatype() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'datatype' field.
      * @return This builder.
      */
    public Literal.Builder clearDatatype() {
      datatype = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lang' field.
      * @return The value.
      */
    public java.lang.CharSequence getLang() {
      return lang;
    }

    /**
      * Sets the value of the 'lang' field.
      * @param value The value of 'lang'.
      * @return This builder.
      */
    public Literal.Builder setLang(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lang = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lang' field has been set.
      * @return True if the 'lang' field has been set, false otherwise.
      */
    public boolean hasLang() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lang' field.
      * @return This builder.
      */
    public Literal.Builder clearLang() {
      lang = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public LiteralKind getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public Literal.Builder setType(LiteralKind value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public Literal.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Literal build() {
      try {
        Literal record = new Literal();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Object) defaultValue(fields()[0]);
        record.datatype = fieldSetFlags()[1] ? this.datatype : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lang = fieldSetFlags()[2] ? this.lang : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (LiteralKind) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Literal>
    WRITER$ = (org.apache.avro.io.DatumWriter<Literal>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Literal>
    READER$ = (org.apache.avro.io.DatumReader<Literal>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}