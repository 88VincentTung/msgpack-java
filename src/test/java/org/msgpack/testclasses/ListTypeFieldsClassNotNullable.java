package org.msgpack.testclasses;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.msgpack.annotation.Message;
import org.msgpack.annotation.NotNullable;
import org.msgpack.template.builder.TestSet;


@Ignore @Message
public class ListTypeFieldsClassNotNullable {
    @NotNullable
    public List<Integer> f0;
    @NotNullable
    public List<Integer> f1;
    @NotNullable
    public List<String> f2;
    @NotNullable
    public List<List<String>> f3;
    @NotNullable
    public List<NestedClass> f4;
    @NotNullable
    public List<ByteBuffer> f5;

    public ListTypeFieldsClassNotNullable() {
    }

    @Override
    public boolean equals(Object o) {
	if (! (o instanceof ListTypeFieldsClassNotNullable)) {
	    return false;
	}
	ListTypeFieldsClassNotNullable that = (ListTypeFieldsClassNotNullable) o;
	// f0
	if (f0 == null) {
	    if (that.f0 != null) {
		return false;
	    }
	}
	if (f0.size() != that.f0.size()) {
	    return false;
	}
	Iterator<Integer> this_f0_iter = f0.iterator();
	Iterator<Integer> that_f0_iter = that.f0.iterator();
	for (; this_f0_iter.hasNext(); ) {
	    if (! this_f0_iter.next().equals(that_f0_iter.next())) {
		return false;
	    }
	}
	// f1
	if (f1 == null) {
	    if (that.f1 != null) {
		return false;
	    }
	}
	if (f1.size() != that.f1.size()) {
	    return false;
	}
	Iterator<Integer> this_f1_iter = f1.iterator();
	Iterator<Integer> that_f1_iter = that.f1.iterator();
	for (; this_f1_iter.hasNext(); ) {
	    if (! this_f1_iter.next().equals(that_f1_iter.next())) {
		return false;
	    }
	}
	// f2
	if (f2 == null) {
	    if (that.f2 != null) {
		return false;
	    }
	}
	if (f2.size() != that.f2.size()) {
	    return false;
	}
	Iterator<String> this_f2_iter = f2.iterator();
	Iterator<String> that_f2_iter = that.f2.iterator();
	for (; this_f2_iter.hasNext(); ) {
	    if (! this_f2_iter.next().equals(that_f2_iter.next())) {
		return false;
	    }
	}
	// f3
	if (f3 == null) {
	    if (that.f3 != null) {
		return false;
	    }
	}
	if (f3.size() != that.f3.size()) {
	    return false;
	}
	Iterator<List<String>> this_f3_iter = f3.iterator();
	Iterator<List<String>> that_f3_iter = that.f3.iterator();
	for (; this_f3_iter.hasNext(); ) {
	    List<String> l0 = this_f3_iter.next();
	    List<String> l1 = that_f3_iter.next();
	    if (l0.size() != l1.size()) {
		return false;
	    }
	    Iterator<String> l0_iter = l0.iterator();
	    Iterator<String> l1_iter = l1.iterator();
	    for (; l0_iter.hasNext(); ) {
		if (! l0_iter.next().equals(l1_iter.next())) {
		    return false;
		}
	    }
	}
	// f4
	if (f4 == null) {
	    if (that.f4 != null) {
		return false;
	    }
	}
	if (f4.size() != that.f4.size()) {
	    return false;
	}
	Iterator<NestedClass> this_f4_iter = f4.iterator();
	Iterator<NestedClass> that_f4_iter = that.f4.iterator();
	for (; this_f4_iter.hasNext(); ) {
	    if (! this_f4_iter.next().equals(that_f4_iter.next())) {
		return false;
	    }
	}
	// f5
	if (f5 == null) {
	    if (that.f5 != null) {
		return false;
	    }
	}
	if (f5.size() != that.f5.size()) {
	    return false;
	}
	Iterator<ByteBuffer> this_f5_iter = f5.iterator();
	Iterator<ByteBuffer> that_f5_iter = that.f5.iterator();
	for (; this_f5_iter.hasNext(); ) {
	    byte[] b0 = TestSet.toByteArray(this_f5_iter.next());
	    byte[] b1 = TestSet.toByteArray(that_f5_iter.next());
	    if (b0.length != b1.length) {
		return false;
	    }
	    for (int i = 0; i < b0.length; ++i) {
		if (b0[i] != b1[i]) {
		    return false;
		}
	    }
	}
	return true;
    }

    @Ignore @Message
    public static class NestedClass {
	@NotNullable
	public byte[] f0;
	@NotNullable
	public String f1;

	public NestedClass() {}

	@Override
	public boolean equals(Object o) {
	    if (! (o instanceof NestedClass)) {
		return false;
	    }

	    NestedClass that = (NestedClass) o;
	    // f0
	    if (f0 == null) {
		if (that.f0 != null) {
		    return false;
		}
	    }
	    if (f0.length != that.f0.length) {
		return false;
	    }
	    for (int i = 0; i < f0.length; ++i) {
		if (f0[i] != that.f0[i]) {
		    return false;
		}
	    }
	    // f1
	    if (f1 == null) {
		if (that.f1 != null) {
		    return false;
		}
	    }
	    if (! f1.equals(that.f1)) {
		return false;
	    }
	    return true;
	}
    }
}
