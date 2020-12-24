//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonArray extends JsonElement implements Iterable<JsonElement>, Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private final List<JsonElement> elements;

    public JsonArray() {
        this.elements = new ArrayList();
    }

    public JsonArray(int capacity) {
        this.elements = new ArrayList(capacity);
    }

    public JsonArray deepCopy() {
        if (this.elements.isEmpty()) {
            return new JsonArray();
        } else {
            JsonArray result = new JsonArray(this.elements.size());
            Iterator var2 = this.elements.iterator();

            while(var2.hasNext()) {
                JsonElement element = (JsonElement)var2.next();
                result.add(element.deepCopy());
            }

            return result;
        }
    }

    public void add(Boolean bool) {
        this.elements.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void add(Character character) {
        this.elements.add(character == null ? JsonNull.INSTANCE : new JsonPrimitive(character));
    }

    public void add(Number number) {
        this.elements.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String string) {
        this.elements.add(string == null ? JsonNull.INSTANCE : new JsonPrimitive(string));
    }

    public void add(JsonElement element) {
        if (element == null) {
            element = JsonNull.INSTANCE;
        }

        this.elements.add(element);
    }

    public void addAll(JsonArray array) {
        this.elements.addAll(array.elements);
    }

    public JsonElement set(int index, JsonElement element) {
        return (JsonElement)this.elements.set(index, element);
    }

    public boolean remove(JsonElement element) {
        return this.elements.remove(element);
    }

    public JsonElement remove(int index) {
        return (JsonElement)this.elements.remove(index);
    }

    public boolean contains(JsonElement element) {
        return this.elements.contains(element);
    }

    public int size() {
        return this.elements.size();
    }

    public Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public JsonElement get(int i) {
        return (JsonElement)this.elements.get(i);
    }

    public Number getAsNumber() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsNumber();
        } else {
            throw new IllegalStateException();
        }
    }

    public String getAsString() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsString();
        } else {
            throw new IllegalStateException();
        }
    }

    public double getAsDouble() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsDouble();
        } else {
            throw new IllegalStateException();
        }
    }

    public BigDecimal getAsBigDecimal() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsBigDecimal();
        } else {
            throw new IllegalStateException();
        }
    }

    public BigInteger getAsBigInteger() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsBigInteger();
        } else {
            throw new IllegalStateException();
        }
    }

    public float getAsFloat() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsFloat();
        } else {
            throw new IllegalStateException();
        }
    }

    public long getAsLong() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsLong();
        } else {
            throw new IllegalStateException();
        }
    }

    public int getAsInt() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsInt();
        } else {
            throw new IllegalStateException();
        }
    }

    public byte getAsByte() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsByte();
        } else {
            throw new IllegalStateException();
        }
    }

    public char getAsCharacter() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsCharacter();
        } else {
            throw new IllegalStateException();
        }
    }

    public short getAsShort() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsShort();
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean getAsBoolean() {
        if (this.elements.size() == 1) {
            return ((JsonElement)this.elements.get(0)).getAsBoolean();
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object o) {
        return o == this || o instanceof JsonArray && ((JsonArray)o).elements.equals(this.elements);
    }

    public int hashCode() {
        return this.elements.hashCode();
    }
}
