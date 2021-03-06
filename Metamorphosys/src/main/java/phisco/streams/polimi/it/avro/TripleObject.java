/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package phisco.streams.polimi.it.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TripleObject extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4066954954952653578L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TripleObject\",\"namespace\":\"phisco.streams.polimi.it.avro\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"long\",\"float\"]},{\"name\":\"datatype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Kind\",\"symbols\":[\"literal\",\"uri\",\"bnode\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TripleObject> ENCODER =
      new BinaryMessageEncoder<TripleObject>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TripleObject> DECODER =
      new BinaryMessageDecoder<TripleObject>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TripleObject> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TripleObject> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TripleObject>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TripleObject to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TripleObject from a ByteBuffer. */
  public static TripleObject fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Object value;
  @Deprecated public java.lang.String datatype;
  @Deprecated public phisco.streams.polimi.it.avro.Kind type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TripleObject() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param datatype The new value for datatype
   * @param type The new value for type
   */
  public TripleObject(java.lang.Object value, java.lang.String datatype, phisco.streams.polimi.it.avro.Kind type) {
    this.value = value;
    this.datatype = datatype;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return datatype;
    case 2: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Object)value$; break;
    case 1: datatype = (java.lang.String)value$; break;
    case 2: type = (phisco.streams.polimi.it.avro.Kind)value$; break;
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
  public java.lang.String getDatatype() {
    return datatype;
  }

  /**
   * Sets the value of the 'datatype' field.
   * @param value the value to set.
   */
  public void setDatatype(java.lang.String value) {
    this.datatype = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public phisco.streams.polimi.it.avro.Kind getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(phisco.streams.polimi.it.avro.Kind value) {
    this.type = value;
  }

  /**
   * Creates a new TripleObject RecordBuilder.
   * @return A new TripleObject RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.TripleObject.Builder newBuilder() {
    return new phisco.streams.polimi.it.avro.TripleObject.Builder();
  }

  /**
   * Creates a new TripleObject RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TripleObject RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.TripleObject.Builder newBuilder(phisco.streams.polimi.it.avro.TripleObject.Builder other) {
    return new phisco.streams.polimi.it.avro.TripleObject.Builder(other);
  }

  /**
   * Creates a new TripleObject RecordBuilder by copying an existing TripleObject instance.
   * @param other The existing instance to copy.
   * @return A new TripleObject RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.TripleObject.Builder newBuilder(phisco.streams.polimi.it.avro.TripleObject other) {
    return new phisco.streams.polimi.it.avro.TripleObject.Builder(other);
  }

  /**
   * RecordBuilder for TripleObject instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TripleObject>
    implements org.apache.avro.data.RecordBuilder<TripleObject> {

    private java.lang.Object value;
    private java.lang.String datatype;
    private phisco.streams.polimi.it.avro.Kind type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(phisco.streams.polimi.it.avro.TripleObject.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datatype)) {
        this.datatype = data().deepCopy(fields()[1].schema(), other.datatype);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TripleObject instance
     * @param other The existing instance to copy.
     */
    private Builder(phisco.streams.polimi.it.avro.TripleObject other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.datatype)) {
        this.datatype = data().deepCopy(fields()[1].schema(), other.datatype);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
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
    public phisco.streams.polimi.it.avro.TripleObject.Builder setValue(java.lang.Object value) {
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
    public phisco.streams.polimi.it.avro.TripleObject.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'datatype' field.
      * @return The value.
      */
    public java.lang.String getDatatype() {
      return datatype;
    }

    /**
      * Sets the value of the 'datatype' field.
      * @param value The value of 'datatype'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.TripleObject.Builder setDatatype(java.lang.String value) {
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
    public phisco.streams.polimi.it.avro.TripleObject.Builder clearDatatype() {
      datatype = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public phisco.streams.polimi.it.avro.Kind getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.TripleObject.Builder setType(phisco.streams.polimi.it.avro.Kind value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.TripleObject.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TripleObject build() {
      try {
        TripleObject record = new TripleObject();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Object) defaultValue(fields()[0]);
        record.datatype = fieldSetFlags()[1] ? this.datatype : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (phisco.streams.polimi.it.avro.Kind) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TripleObject>
    WRITER$ = (org.apache.avro.io.DatumWriter<TripleObject>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TripleObject>
    READER$ = (org.apache.avro.io.DatumReader<TripleObject>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
