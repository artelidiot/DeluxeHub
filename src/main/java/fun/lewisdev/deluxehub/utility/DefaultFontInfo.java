package fun.lewisdev.deluxehub.utility;

public enum DefaultFontInfo {

    A('A', 5),
    B('B', 5),
    C('C', 5),
    D('D', 5),
    E('E', 5),
    F('F', 5),
    G('G', 5),
    H('H', 5),
    I('I', 3),
    J('J', 5),
    K('K', 5),
    L('L', 5),
    M('M', 5),
    N('N', 5),
    O('O', 5),
    P('P', 5),
    Q('Q', 5),
    R('R', 5),
    S('S', 5),
    T('T', 5),
    U('U', 5),
    V('V', 5),
    W('W', 5),
    X('X', 5),
    Y('Y', 5),
    Z('Z', 5),
    a('a', 5),
    b('b', 5),
    c('c', 5),
    d('d', 5),
    e('e', 5),
    f('f', 4),
    g('g', 5),
    h('h', 5),
    i('i', 1),
    j('j', 5),
    k('k', 4),
    l('l', 1),
    m('m', 5),
    n('n', 5),
    o('o', 5),
    p('p', 5),
    q('q', 5),
    r('r', 5),
    s('s', 5),
    t('t', 4),
    u('u', 5),
    v('v', 5),
    w('w', 5),
    x('x', 5),
    y('y', 5),
    z('z', 5),
    NUMBER_0('0', 5),
    NUMBER_1('1', 5),
    NUMBER_2('2', 5),
    NUMBER_3('3', 5),
    NUMBER_4('4', 5),
    NUMBER_5('5', 5),
    NUMBER_6('6', 5),
    NUMBER_7('7', 5),
    NUMBER_8('8', 5),
    NUMBER_9('9', 5),
    AMPERSAND('&', 5),
    APOSTROPHE('\'', 1),
    ASTERISK('*', 5),
    AT_SIGN('@', 6),
    BACKTICK('`', 2),
    BACKSLASH('\\', 5),
    CARET('^', 5),
    COLON(':', 1),
    COMMA(',', 1),
    DEFAULT('a', 4),
    DOLLAR_SIGN('$', 5),
    EQUALS('=', 5),
    EXCLAMATION_POINT('!', 1),
    LEFT_ANGLE('<', 4),
    LEFT_BRACE('{', 4),
    LEFT_BRACKET('[', 3),
    LEFT_PARENTHESIS('(', 4),
    MINUS('-', 5),
    NUMBER_SIGN('#', 5),
    PERCENT('%', 5),
    PERIOD('.', 1),
    PLUS('+', 5),
    QUESTION_MARK('?', 5),
    QUOTATION('"', 3),
    RIGHT_ANGLE('>', 4),
    RIGHT_BRACE('}', 4),
    RIGHT_BRACKET(']', 3),
    RIGHT_PARENTHESIS(')', 4),
    SEMI_COLON(';', 1),
    SLASH('/', 5),
    SPACE(' ', 3),
    TILDE('~', 5),
    UNDERSCORE('_', 5),
    VERTICAL_BAR('|', 1);

    private char character;
    private int length;

    DefaultFontInfo(char character, int length) {
        this.character = character;
        this.length = length;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getLength() {
        return this.length;
    }

    public int getBoldLength() {
        if (this == DefaultFontInfo.SPACE) return this.getLength();
        return this.length + 1;
    }

    public static DefaultFontInfo getDefaultFontInfo(char c) {
        for (DefaultFontInfo dFI : DefaultFontInfo.values()) {
            if (dFI.getCharacter() == c) return dFI;
        }
        return DefaultFontInfo.DEFAULT;
    }
}

