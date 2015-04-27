package todo;

/**
 * Created by yang on 2015/4/27.
 */
public enum TodoType {

    NORMAL,
    IMPORT {
        @Override
        public boolean isImportant() {
            return true;
        }
    },
    URGENT {
        @Override
        public boolean isUrgent() {
            return true;
        }
    },

    IMPORT_URGENT {
        @Override
        public boolean isImportant() {
            return true;
        }

        @Override
        public boolean isUrgent() {
            return true;
        }
    };

    public boolean isImportant() {
        return false;
    }

    public boolean isUrgent() {
        return false;
    }
}
