/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-18")
public class TaskComponent implements org.apache.thrift.TBase<TaskComponent, TaskComponent._Fields>, java.io.Serializable, Cloneable, Comparable<TaskComponent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskComponent");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMPONENT_FIELD_DESC = new org.apache.thrift.protocol.TField("component", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskComponentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskComponentTupleSchemeFactory());
  }

  private int taskId; // required
  private String component; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    COMPONENT((short)2, "component");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // COMPONENT
          return COMPONENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TASKID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPONENT, new org.apache.thrift.meta_data.FieldMetaData("component", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskComponent.class, metaDataMap);
  }

  public TaskComponent() {
  }

  public TaskComponent(
    int taskId,
    String component)
  {
    this();
    this.taskId = taskId;
    set_taskId_isSet(true);
    this.component = component;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskComponent(TaskComponent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.taskId = other.taskId;
    if (other.is_set_component()) {
      this.component = other.component;
    }
  }

  public TaskComponent deepCopy() {
    return new TaskComponent(this);
  }

  @Override
  public void clear() {
    set_taskId_isSet(false);
    this.taskId = 0;
    this.component = null;
  }

  public int get_taskId() {
    return this.taskId;
  }

  public void set_taskId(int taskId) {
    this.taskId = taskId;
    set_taskId_isSet(true);
  }

  public void unset_taskId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean is_set_taskId() {
    return EncodingUtils.testBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  public void set_taskId_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TASKID_ISSET_ID, value);
  }

  public String get_component() {
    return this.component;
  }

  public void set_component(String component) {
    this.component = component;
  }

  public void unset_component() {
    this.component = null;
  }

  /** Returns true if field component is set (has been assigned a value) and false otherwise */
  public boolean is_set_component() {
    return this.component != null;
  }

  public void set_component_isSet(boolean value) {
    if (!value) {
      this.component = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unset_taskId();
      } else {
        set_taskId((Integer)value);
      }
      break;

    case COMPONENT:
      if (value == null) {
        unset_component();
      } else {
        set_component((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return Integer.valueOf(get_taskId());

    case COMPONENT:
      return get_component();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return is_set_taskId();
    case COMPONENT:
      return is_set_component();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskComponent)
      return this.equals((TaskComponent)that);
    return false;
  }

  public boolean equals(TaskComponent that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true;
    boolean that_present_taskId = true;
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (this.taskId != that.taskId)
        return false;
    }

    boolean this_present_component = true && this.is_set_component();
    boolean that_present_component = true && that.is_set_component();
    if (this_present_component || that_present_component) {
      if (!(this_present_component && that_present_component))
        return false;
      if (!this.component.equals(that.component))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true;
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_component = true && (is_set_component());
    list.add(present_component);
    if (present_component)
      list.add(component);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskComponent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_taskId()).compareTo(other.is_set_taskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_taskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_component()).compareTo(other.is_set_component());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_component()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.component, other.component);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskComponent(");
    boolean first = true;

    sb.append("taskId:");
    sb.append(this.taskId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("component:");
    if (this.component == null) {
      sb.append("null");
    } else {
      sb.append(this.component);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_taskId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskId' is unset! Struct:" + toString());
    }

    if (!is_set_component()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'component' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskComponentStandardSchemeFactory implements SchemeFactory {
    public TaskComponentStandardScheme getScheme() {
      return new TaskComponentStandardScheme();
    }
  }

  private static class TaskComponentStandardScheme extends StandardScheme<TaskComponent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskComponent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskId = iprot.readI32();
              struct.set_taskId_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPONENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.component = iprot.readString();
              struct.set_component_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskComponent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI32(struct.taskId);
      oprot.writeFieldEnd();
      if (struct.component != null) {
        oprot.writeFieldBegin(COMPONENT_FIELD_DESC);
        oprot.writeString(struct.component);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskComponentTupleSchemeFactory implements SchemeFactory {
    public TaskComponentTupleScheme getScheme() {
      return new TaskComponentTupleScheme();
    }
  }

  private static class TaskComponentTupleScheme extends TupleScheme<TaskComponent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.taskId);
      oprot.writeString(struct.component);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.taskId = iprot.readI32();
      struct.set_taskId_isSet(true);
      struct.component = iprot.readString();
      struct.set_component_isSet(true);
    }
  }

}

