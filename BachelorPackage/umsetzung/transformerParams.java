public static enum FilterType {
	BLACKLIST,
	WHITELIST,
	ALL,
	NOTHING
}

public TransformingClassLoader(
	boolean cache, 
	List<Class<? extends TransformationEventListener>>
			transformers, 
	FilterType filterType, 
	Map<Pattern, LineSpecification> filter, 
	LineSpecification defaultLineSpec,
	boolean debug)