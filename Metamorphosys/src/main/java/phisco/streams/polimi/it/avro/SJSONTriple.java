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
public class SJSONTriple extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9110606108457841464L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SJSONTriple\",\"namespace\":\"phisco.streams.polimi.it.avro\",\"fields\":[{\"name\":\"s\",\"type\":\"string\"},{\"name\":\"p\",\"type\":\"string\"},{\"name\":\"o\",\"type\":[{\"type\":\"record\",\"name\":\"Literal\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"long\",\"float\"]},{\"name\":\"datatype\",\"type\":[\"null\",\"string\"]},{\"name\":\"lang\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"LiteralKind\",\"symbols\":[\"literal\"]}}]},{\"type\":\"record\",\"name\":\"URI\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"URIKind\",\"symbols\":[\"uri\"]}}]},{\"type\":\"record\",\"name\":\"BNode\",\"fields\":[{\"name\":\"value\",\"type\":\"string\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"BnodeKind\",\"symbols\":[\"bnode\"]}}]}]},{\"name\":\"ts\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SJSONTriple> ENCODER =
      new BinaryMessageEncoder<SJSONTriple>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SJSONTriple> DECODER =
      new BinaryMessageDecoder<SJSONTriple>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<SJSONTriple> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<SJSONTriple> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SJSONTriple>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this SJSONTriple to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a SJSONTriple from a ByteBuffer. */
  public static SJSONTriple fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence s;
  @Deprecated public java.lang.CharSequence p;
  @Deprecated public java.lang.Object o;
  @Deprecated public long ts;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SJSONTriple() {}

  /**
   * All-args constructor.
   * @param s The new value for s
   * @param p The new value for p
   * @param o The new value for o
   * @param ts The new value for ts
   */
  public SJSONTriple(java.lang.CharSequence s, java.lang.CharSequence p, java.lang.Object o, java.lang.Long ts) {
    this.s = s;
    this.p = p;
    this.o = o;
    this.ts = ts;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return s;
    case 1: return p;
    case 2: return o;
    case 3: return ts;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: s = (java.lang.CharSequence)value$; break;
    case 1: p = (java.lang.CharSequence)value$; break;
    case 2: o = (java.lang.Object)value$; break;
    case 3: ts = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 's' field.
   * @return The value of the 's' field.
   */
  public java.lang.CharSequence getS() {
    return s;
  }

  /**
   * Sets the value of the 's' field.
   * @param value the value to set.
   */
  public void setS(java.lang.CharSequence value) {
    this.s = value;
  }

  /**
   * Gets the value of the 'p' field.
   * @return The value of the 'p' field.
   */
  public java.lang.CharSequence getP() {
    return p;
  }

  /**
   * Sets the value of the 'p' field.
   * @param value the value to set.
   */
  public void setP(java.lang.CharSequence value) {
    this.p = value;
  }

  /**
   * Gets the value of the 'o' field.
   * @return The value of the 'o' field.
   */
  public java.lang.Object getO() {
    return o;
  }

  /**
   * Sets the value of the 'o' field.
   * @param value the value to set.
   */
  public void setO(java.lang.Object value) {
    this.o = value;
  }

  /**
   * Gets the value of the 'ts' field.
   * @return The value of the 'ts' field.
   */
  public java.lang.Long getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   * @param value the value to set.
   */
  public void setTs(java.lang.Long value) {
    this.ts = value;
  }

  /**
   * Creates a new SJSONTriple RecordBuilder.
   * @return A new SJSONTriple RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.SJSONTriple.Builder newBuilder() {
    return new phisco.streams.polimi.it.avro.SJSONTriple.Builder();
  }

  /**
   * Creates a new SJSONTriple RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SJSONTriple RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.SJSONTriple.Builder newBuilder(phisco.streams.polimi.it.avro.SJSONTriple.Builder other) {
    return new phisco.streams.polimi.it.avro.SJSONTriple.Builder(other);
  }

  /**
   * Creates a new SJSONTriple RecordBuilder by copying an existing SJSONTriple instance.
   * @param other The existing instance to copy.
   * @return A new SJSONTriple RecordBuilder
   */
  public static phisco.streams.polimi.it.avro.SJSONTriple.Builder newBuilder(phisco.streams.polimi.it.avro.SJSONTriple other) {
    return new phisco.streams.polimi.it.avro.SJSONTriple.Builder(other);
  }

  /**
   * RecordBuilder for SJSONTriple instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SJSONTriple>
    implements org.apache.avro.data.RecordBuilder<SJSONTriple> {

    private java.lang.CharSequence s;
    private java.lang.CharSequence p;
    private java.lang.Object o;
    private long ts;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(phisco.streams.polimi.it.avro.SJSONTriple.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.s)) {
        this.s = data().deepCopy(fields()[0].schema(), other.s);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.p)) {
        this.p = data().deepCopy(fields()[1].schema(), other.p);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.o)) {
        this.o = data().deepCopy(fields()[2].schema(), other.o);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ts)) {
        this.ts = data().deepCopy(fields()[3].schema(), other.ts);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SJSONTriple instance
     * @param other The existing instance to copy.
     */
    private Builder(phisco.streams.polimi.it.avro.SJSONTriple other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.s)) {
        this.s = data().deepCopy(fields()[0].schema(), other.s);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.p)) {
        this.p = data().deepCopy(fields()[1].schema(), other.p);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.o)) {
        this.o = data().deepCopy(fields()[2].schema(), other.o);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ts)) {
        this.ts = data().deepCopy(fields()[3].schema(), other.ts);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 's' field.
      * @return The value.
      */
    public java.lang.CharSequence getS() {
      return s;
    }

    /**
      * Sets the value of the 's' field.
      * @param value The value of 's'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder setS(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.s = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 's' field has been set.
      * @return True if the 's' field has been set, false otherwise.
      */
    public boolean hasS() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 's' field.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder clearS() {
      s = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'p' field.
      * @return The value.
      */
    public java.lang.CharSequence getP() {
      return p;
    }

    /**
      * Sets the value of the 'p' field.
      * @param value The value of 'p'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder setP(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.p = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'p' field has been set.
      * @return True if the 'p' field has been set, false otherwise.
      */
    public boolean hasP() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'p' field.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder clearP() {
      p = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'o' field.
      * @return The value.
      */
    public java.lang.Object getO() {
      return o;
    }

    /**
      * Sets the value of the 'o' field.
      * @param value The value of 'o'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder setO(java.lang.Object value) {
      validate(fields()[2], value);
      this.o = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'o' field has been set.
      * @return True if the 'o' field has been set, false otherwise.
      */
    public boolean hasO() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'o' field.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder clearO() {
      o = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts' field.
      * @return The value.
      */
    public java.lang.Long getTs() {
      return ts;
    }

    /**
      * Sets the value of the 'ts' field.
      * @param value The value of 'ts'.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder setTs(long value) {
      validate(fields()[3], value);
      this.ts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ts' field has been set.
      * @return True if the 'ts' field has been set, false otherwise.
      */
    public boolean hasTs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ts' field.
      * @return This builder.
      */
    public phisco.streams.polimi.it.avro.SJSONTriple.Builder clearTs() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SJSONTriple build() {
      try {
        SJSONTriple record = new SJSONTriple();
        record.s = fieldSetFlags()[0] ? this.s : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.p = fieldSetFlags()[1] ? this.p : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.o = fieldSetFlags()[2] ? this.o : (java.lang.Object) defaultValue(fields()[2]);
        record.ts = fieldSetFlags()[3] ? this.ts : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SJSONTriple>
    WRITER$ = (org.apache.avro.io.DatumWriter<SJSONTriple>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SJSONTriple>
    READER$ = (org.apache.avro.io.DatumReader<SJSONTriple>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
